import onnxruntime as ort

# Load the ONNX model
model_path = "yolov8m.onnx"
session = ort.InferenceSession(model_path)