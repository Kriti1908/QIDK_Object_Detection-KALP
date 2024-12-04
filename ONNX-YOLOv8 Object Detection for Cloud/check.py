import os

model_path = "models/yolov8m.onnx"

if not os.path.exists(model_path):
    print(f"Model file not found at {model_path}. Please ensure the file exists.")
else:
    print(f"Model file found at {model_path}.")