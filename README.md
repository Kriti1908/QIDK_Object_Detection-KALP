# Adaptive Object Detection Mobile Application

This project is an Android application that demonstrates how to use TensorFlow Lite for object detection. The app utilizes various models to detect objects in real-time using the device's camera. It also provides metrics on CPU usage and battery consumption, allowing users to switch between models based on performance criteria.
 
## Table of Contents
- Features
- Requirements
- Setup Instsetupructions
- Usage
- Project Structure inside Android code

## Features
- Automatic switching of ML models based on battery level, CPU usage, and battery consumption.
- Supports multiple ML models, including EfficientDet Lite0, EfficientDet Lite1, EfficientDet Lite2, and MobileNet V1.
- Real-time monitoring of battery level, CPU usage, and battery consumption.
- Logging of device conditions and selected ML model to a log file.
- User interface for displaying metrics and model selection.
- Support for cloud processing via a toggle button.

## Requirements
- Android Studio 4.0 or higher
- Android SDK 21 or higher
- Gradle 6.0 or higher
- TensorFlow Lite dependencies

## Setup Instructions

1. **Clone the Repository**
   ```bash
   git clone https://github.com/Kriti1908/QIDK_Object_Detection-KALP.git tensorflow-lite-object-detection
   cd tensorflow-lite-object-detection
   ```

2. **Open the Project**
   - Open Android Studio and select "Open an existing Android Studio project."
   - Navigate to the cloned repository and open it.

3. **Sync Gradle**
   - Once the project is opened, Android Studio will prompt you to sync Gradle. Click on "Sync Now" to download the necessary dependencies.

4. **Configure Android SDK**
   - Ensure that you have the required Android SDK versions installed. You can check this in the SDK Manager in Android Studio.

5. **Run the Application**
   - Connect an Android device or start an emulator.
   - Click on the "Run" button in Android Studio to build and deploy the application.

5. **Run the Flask app**
   - Connect both the laptop and QIDK to same network and start the flak application for cloud computation.

## Usage
- Launch the application on your device.
- The app will request camera permissions. Grant the necessary permissions to use the camera.
- The main screen will display the camera feed along with the detected objects.
- You can toggle between different models using the provided UI elements.
- Monitor CPU usage and battery consumption metrics displayed on the screen.

## Project Structure inside Android code
app/<br>
├── .gradle/ # Gradle configuration files <br>
├── .idea/ # IDE configuration files<br>
├── build/ # Build output files<br>
├── src/ # Source code<br>
│ ├── main/<br>
│ │ ├── java/ # Java/Kotlin source files<br>
│ │ ├── res/ # Resource files (layouts, drawables, etc.)<br>
│ │ └── AndroidManifest.xml # Application manifest<br>
│ └── androidTest/ # Instrumented tests<br>
├── build.gradle # Project-level Gradle file<br>
└── settings.gradle # Settings for Gradle<br>
