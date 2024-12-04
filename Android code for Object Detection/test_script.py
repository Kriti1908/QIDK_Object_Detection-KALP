# import socket
# import threading
# from flask import Flask, request

# app = Flask(__name__)

# # Function to handle incoming TCP connections
# def handle_client_connection(client_socket):
#     try:
#         # Receive the image data
#         image_data = b""
#         while True:
#             chunk = client_socket.recv(4096)  # Receive data in chunks
#             if not chunk:
#                 break
#             image_data += chunk

#         # Here you can process the image data (e.g., save it, analyze it, etc.)
#         # with open("received_image.jpg", "wb") as image_file:
#         #     image_file.write(image_data)
#         print("Image received and saved as 'received_image.jpg'.")

#     except Exception as e:
#         print(f"Error: {e}")
#     finally:
#         client_socket.close()

# # TCP server function
# def start_tcp_server():
#     server = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
#     server.bind(("0.0.0.0", 5000))  # Bind to all interfaces on port 5000
#     server.listen(5)
#     print("TCP server listening on port 5000...")

#     while True:
#         client_socket, addr = server.accept()
#         print(f"Accepted connection from {addr}")
#         client_handler = threading.Thread(target=handle_client_connection, args=(client_socket,))
#         client_handler.start()

# # Flask route to check server status
# @app.route('/')
# def index():
#     return "Flask server is running. TCP server is also active."

# if __name__ == "__main__":
#     # Start the TCP server in a separate thread
#     tcp_thread = threading.Thread(target=start_tcp_server)
#     tcp_thread.start()

#     # Start the Flask server
#     app.run(host='0.0.0.0', port=5001)  # Flask runs on a different port

# import requests
# import base64
# from PIL import Image
# from io import BytesIO


@app.route('/upload', methods=['POST'])
def upload_image():
    file = request.files.get('file')
    
    if not file:
        print("No file received.")
        response = jsonify({"error": "No file received"})
        print("Request Status: 400 - No file received")
        return response, 400

    print("Received file:", file.filename)  # Print the received file details
    print("File size:", len(file.read()))  # Print the size of the file data

    response = jsonify({"message": "Image received and processed successfully"})
    print("Request Status: 200 - Image received and processed successfully")
    return response, 200

if __name__ == '__main__':
    app.run(host='0.0.0.0', port=5000)