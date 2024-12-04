from ultralytics import YOLO

model = YOLO("yolov8m.pt")  # Replace "yolov8m.pt" with the actual model path if needed
model.export(format="onnx", imgsz=[480, 640])
