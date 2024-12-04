import requests
import base64
from PIL import Image
from io import BytesIO

# Load the image as binary data
image_path = '/home/ananyahalgatti/Pictures/IMG_20190321_091303.jpg'  # Replace with your image path
with open(image_path, 'rb') as f:
    bitmap_data = f.read()

# Send a POST request to the Flask server with the bitmap data
response = requests.post('http://127.0.0.1:5000/detect', data=bitmap_data)

# Process the server's response
print("Response status code:", response.status_code)
if response.status_code == 200:
    result = response.json()  # Parse JSON response
    
    # Print detection results (boxes, scores, and class IDs)
    print("Detection Results:")
    print("Boxes:", result.get('boxes', []))
    print("Scores:", result.get('scores', []))
    print("Class IDs:", result.get('class_ids', []))
    
    # Check and decode the returned image
    if 'image' in result:
        print("Decoding and saving the processed image...")
        image_data = base64.b64decode(result['image'])
        output_path = "detected_objects.jpg"  # Save as this file
        with open(output_path, "wb") as f:
            f.write(image_data)
        print(f"Processed image saved as {output_path}.")
    else:
        print("No image found in the server response.")
else:
    print(f"Error: {response.status_code}")
    print("Response text:", response.text)
