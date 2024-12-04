import cv2
import numpy as np
from flask import Flask, request, send_file
from yolov8 import YOLOv8
from io import BytesIO
import os

app = Flask(__name__)

# Initialize the YOLOv8 object detector
model_path = "models/yolov8m.onnx"
yolov8_detector = YOLOv8(model_path, conf_thres=0.5, iou_thres=0.5)

# Counter to track frames and save every 1 in 100
frame_counter = 0
output_dir = "saved_frames"
os.makedirs(output_dir, exist_ok=True)  # Ensure directory exists

@app.route('/detect', methods=['POST'])
def detect():
    global frame_counter

    # Check if the request contains binary image data
    if not request.data:
        return "No image data received", 400

    try:
        # Decode binary data to an image
        np_array = np.frombuffer(request.data, np.uint8)
        frame = cv2.imdecode(np_array, cv2.IMREAD_COLOR)

        if frame is None:
            print("Error: Decoded frame is None")
            return "Invalid image data", 400

        # Log the frame shape
        print(f"Input frame shape: {frame.shape}")

        # Process the frame using YOLOv8
        boxes, scores, class_ids = yolov8_detector(frame)
        print(f"Detected {len(boxes)} objects")
        print(f"Boxes: {boxes}")
        print(f"Scores: {scores}")
        print(f"Class IDs: {class_ids}")

        # Check if any objects are detected
        if not boxes:
            print("No objects detected")
            return "No objects detected", 200

        # Draw detections on the frame
        processed_frame = yolov8_detector.draw_detections(frame)

        # Check if processed_frame is valid
        if processed_frame is None:
            print("Error: Processed frame is None after drawing detections")
            return "Failed to draw detections on the frame", 500

        # Increment the frame counter
        frame_counter += 1

        # Save every 1 in 100 frames to a file
        if frame_counter % 10 == 0:
            output_path = os.path.join(output_dir, f"frame_{frame_counter}.jpg")
            success = cv2.imwrite(output_path, processed_frame)
            if success:
                print(f"Frame saved successfully: {output_path}")
            else:
                print(f"Error saving frame: {output_path}")

        # Encode the processed frame to JPEG
        _, buffer = cv2.imencode('.jpg', processed_frame)

        if buffer is None:
            print("Error: Failed to encode processed frame to JPEG")
            return "Failed to encode processed frame", 500

        # Send the processed image as a binary response
        return send_file(
            BytesIO(buffer.tobytes()),
            mimetype='image/jpeg'
        )

    except Exception as e:
        print(f"Error processing image: {str(e)}")
        return f"Error processing image: {str(e)}", 500


if __name__ == '__main__':
    app.run(host='0.0.0.0', port=5000, debug=True)
