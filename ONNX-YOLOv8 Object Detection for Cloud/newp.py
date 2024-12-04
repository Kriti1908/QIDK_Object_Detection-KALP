import cv2
import numpy as np
from flask import Flask, request
from yolov8 import YOLOv8
import os

app = Flask(__name__)

# Initialize the YOLOv8 object detector
model_path = "models/yolov8m.onnx"
yolov8_detector = YOLOv8(model_path, conf_thres=0.5, iou_thres=0.5)

# Directory to save intermediate frames (optional)
output_dir = "saved_frames"
os.makedirs(output_dir, exist_ok=True)  # Ensure directory exists

# Counter for saving frames periodically
frame_counter = 0

# @app.route('/detect', methods=['GET'])
# def blah():
#     return "Helloo world"

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
        print(f"Processing frame {frame_counter} - Shape: {frame.shape}")

        # Process the frame using YOLOv8
        boxes, scores, class_ids = yolov8_detector(frame)
        print(f"Detected {len(boxes)} objects")
        print(f"Boxes: {boxes}")
        print(f"Scores: {scores}")
        print(f"Class IDs: {class_ids}")

        # Draw detections on the frame
        processed_frame = yolov8_detector.draw_detections(frame)

        # Save every 1 in 100 frames
        frame_counter += 1
        if frame_counter % 1 == 0:
            output_path = f"{output_dir}/frame_{frame_counter}.jpg"
            success = cv2.imwrite(output_path, processed_frame)
            if success:
                print(f"Frame saved: {output_path}")
            else:
                print("Error saving frame.")

        # No need to display the frame if running headlessly
        # If needed, you can save or further process the frame here

        # No need to send any response back to the client
        return "Frame processed and saved", 200

    except Exception as e:
        print(f"Error processing image: {e}")
        return f"Error processing image: {str(e)}", 500

if __name__ == '__main__':
    app.run(host='0.0.0.0', port=5000, debug=True)
