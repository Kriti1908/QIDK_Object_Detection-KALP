package org.tensorflow.lite.examples.objectdetection.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00bc\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u001e\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u00108\u001a\u000209H\u0003J\u0010\u0010:\u001a\u0002092\u0006\u0010;\u001a\u00020<H\u0002J\b\u0010=\u001a\u00020\tH\u0002J\b\u0010>\u001a\u00020\u0005H\u0002J\b\u0010?\u001a\u00020\tH\u0002J\b\u0010@\u001a\u00020\u0011H\u0002J\b\u0010A\u001a\u00020\u0011H\u0002J\b\u0010B\u001a\u000209H\u0002J\u0010\u0010C\u001a\u0002092\u0006\u0010D\u001a\u00020EH\u0016J$\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020I2\b\u0010J\u001a\u0004\u0018\u00010K2\b\u0010L\u001a\u0004\u0018\u00010MH\u0016J\b\u0010N\u001a\u000209H\u0016J\u0010\u0010O\u001a\u0002092\u0006\u0010P\u001a\u00020\u0011H\u0016J0\u0010Q\u001a\u0002092\u000e\u0010R\u001a\n\u0012\u0004\u0012\u00020T\u0018\u00010S2\u0006\u0010U\u001a\u00020\u00072\u0006\u0010V\u001a\u00020\u00052\u0006\u0010W\u001a\u00020\u0005H\u0016J\b\u0010X\u001a\u000209H\u0016J\u001a\u0010Y\u001a\u0002092\u0006\u0010Z\u001a\u00020G2\b\u0010L\u001a\u0004\u0018\u00010MH\u0017J \u0010[\u001a\u0002092\u0006\u0010\\\u001a\u00020\u001d2\u0006\u0010]\u001a\u00020\u00052\u0006\u0010;\u001a\u00020<H\u0002J\b\u0010^\u001a\u000209H\u0002J\u0010\u0010_\u001a\u0002092\u0006\u0010`\u001a\u00020\u0016H\u0002J\b\u0010a\u001a\u000209H\u0002J\b\u0010b\u001a\u000209H\u0002J\b\u0010c\u001a\u000209H\u0002J\b\u0010d\u001a\u000209H\u0002J6\u0010e\u001a\u0002092\u0006\u0010`\u001a\u00020\u00162\f\u0010f\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010g\u001a\u00020\t2\u0006\u0010h\u001a\u00020\u00112\u0006\u0010i\u001a\u00020\u0005H\u0002J \u0010j\u001a\u0002092\u0006\u0010k\u001a\u00020\u00052\u0006\u0010l\u001a\u00020\t2\u0006\u0010m\u001a\u00020\tH\u0002J\b\u0010n\u001a\u000209H\u0002J \u0010o\u001a\u0002092\u0006\u0010p\u001a\u00020\u001d2\u0006\u0010]\u001a\u00020\u00052\u0006\u0010;\u001a\u00020<H\u0002J\b\u0010q\u001a\u000209H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010(\u001a\u00020\u00138BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b)\u0010*R\u0010\u0010+\u001a\u0004\u0018\u00010,X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u000200X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u00101\u001a\u0004\u0018\u000102X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00105\u001a\u000206X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006r"}, d2 = {"Lorg/tensorflow/lite/examples/objectdetection/fragments/CameraFragment;", "Landroidx/fragment/app/Fragment;", "Lorg/tensorflow/lite/examples/objectdetection/ObjectDetectorHelper$DetectorListener;", "()V", "CPU_Usage", "", "E0TimeLapsed", "", "E0avg", "", "E1TimeLapsed", "E1avg", "E2TimeLapsed", "E2avg", "MVTimeLapsed", "MVavg", "TAG", "", "_fragmentCameraBinding", "Lorg/tensorflow/lite/examples/objectdetection/databinding/FragmentCameraBinding;", "abs_start_time", "batteryConsumptionChart", "Lcom/github/mikephil/charting/charts/LineChart;", "batteryConsumptionEntries", "Ljava/util/ArrayList;", "Lcom/github/mikephil/charting/data/Entry;", "batteryLevelChart", "batteryLevelEntries", "bitmapBuffer", "Landroid/graphics/Bitmap;", "camera", "Landroidx/camera/core/Camera;", "cameraExecutor", "Ljava/util/concurrent/ExecutorService;", "cameraProvider", "Landroidx/camera/lifecycle/ProcessCameraProvider;", "chartXValue", "cloudFlag", "cpuUsageChart", "cpuUsageEntries", "fragmentCameraBinding", "getFragmentCameraBinding", "()Lorg/tensorflow/lite/examples/objectdetection/databinding/FragmentCameraBinding;", "imageAnalyzer", "Landroidx/camera/core/ImageAnalysis;", "metricLogger", "Lorg/tensorflow/lite/examples/objectdetection/MetricLogger;", "objectDetectorHelper", "Lorg/tensorflow/lite/examples/objectdetection/ObjectDetectorHelper;", "preview", "Landroidx/camera/core/Preview;", "start_time", "start_time_cloud", "switchToCloudButton", "Landroid/widget/ToggleButton;", "time_slice", "bindCameraUseCases", "", "detectObjects", "image", "Landroidx/camera/core/ImageProxy;", "getBatteryConsumption", "getBatteryLevel", "getCpuUsage", "getModelBasedOnCriteria", "getSelectedModel", "initBottomSheetControls", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onError", "error", "onResults", "results", "", "Lorg/tensorflow/lite/task/vision/detector/Detection;", "inferenceTime", "imageHeight", "imageWidth", "onResume", "onViewCreated", "view", "sendFrameToCloud", "bitmap", "imageRotation", "setUpCamera", "setupChart", "chart", "setupCharts", "showGraphsSection", "showStatsSection", "startMetricUpdates", "updateChart", "entries", "newValue", "label", "color", "updateCharts", "batteryLevel", "cpuUsage", "batteryConsumption", "updateControlsUi", "updateProcessedFrame", "processedBitmap", "updateSelectedModel", "app_debug"})
public final class CameraFragment extends androidx.fragment.app.Fragment implements org.tensorflow.lite.examples.objectdetection.ObjectDetectorHelper.DetectorListener {
    private int CPU_Usage = 0;
    private final java.lang.String TAG = "ObjectDetection";
    private org.tensorflow.lite.examples.objectdetection.databinding.FragmentCameraBinding _fragmentCameraBinding;
    private org.tensorflow.lite.examples.objectdetection.ObjectDetectorHelper objectDetectorHelper;
    private android.graphics.Bitmap bitmapBuffer;
    private androidx.camera.core.Preview preview;
    private androidx.camera.core.ImageAnalysis imageAnalyzer;
    private androidx.camera.core.Camera camera;
    private androidx.camera.lifecycle.ProcessCameraProvider cameraProvider;
    private org.tensorflow.lite.examples.objectdetection.MetricLogger metricLogger;
    private com.github.mikephil.charting.charts.LineChart batteryLevelChart;
    private com.github.mikephil.charting.charts.LineChart cpuUsageChart;
    private com.github.mikephil.charting.charts.LineChart batteryConsumptionChart;
    private final java.util.ArrayList<com.github.mikephil.charting.data.Entry> batteryLevelEntries = null;
    private final java.util.ArrayList<com.github.mikephil.charting.data.Entry> cpuUsageEntries = null;
    private final java.util.ArrayList<com.github.mikephil.charting.data.Entry> batteryConsumptionEntries = null;
    private float chartXValue = 0.0F;
    private android.widget.ToggleButton switchToCloudButton;
    private long E0TimeLapsed = 0L;
    private long E1TimeLapsed = 0L;
    private long E2TimeLapsed = 0L;
    private long MVTimeLapsed = 0L;
    private long start_time = 0L;
    private long abs_start_time = 0L;
    private float E0avg = 0.0F;
    private float E1avg = 0.0F;
    private float E2avg = 0.0F;
    private float MVavg = 0.0F;
    private long cloudFlag = 0L;
    private long start_time_cloud = 0L;
    private int time_slice = 2;
    
    /**
     * Blocking camera operations are performed using this executor
     */
    private java.util.concurrent.ExecutorService cameraExecutor;
    
    public CameraFragment() {
        super();
    }
    
    private final org.tensorflow.lite.examples.objectdetection.databinding.FragmentCameraBinding getFragmentCameraBinding() {
        return null;
    }
    
    private final void updateSelectedModel() {
    }
    
    private final java.lang.String getSelectedModel() {
        return null;
    }
    
    private final java.lang.String getModelBasedOnCriteria() {
        return null;
    }
    
    private final float getCpuUsage() {
        return 0.0F;
    }
    
    private final int getBatteryLevel() {
        return 0;
    }
    
    private final float getBatteryConsumption() {
        return 0.0F;
    }
    
    private final void updateCharts(int batteryLevel, float cpuUsage, float batteryConsumption) {
    }
    
    private final void updateChart(com.github.mikephil.charting.charts.LineChart chart, java.util.ArrayList<com.github.mikephil.charting.data.Entry> entries, float newValue, java.lang.String label, int color) {
    }
    
    @java.lang.Override
    public void onResume() {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void setupChart(com.github.mikephil.charting.charts.LineChart chart) {
    }
    
    private final void setupCharts() {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void detectObjects(androidx.camera.core.ImageProxy image) {
    }
    
    private final void sendFrameToCloud(android.graphics.Bitmap bitmap, int imageRotation, androidx.camera.core.ImageProxy image) {
    }
    
    private final void updateProcessedFrame(android.graphics.Bitmap processedBitmap, int imageRotation, androidx.camera.core.ImageProxy image) {
    }
    
    private final void showStatsSection() {
    }
    
    private final void showGraphsSection() {
    }
    
    private final void startMetricUpdates() {
    }
    
    private final void initBottomSheetControls() {
    }
    
    private final void updateControlsUi() {
    }
    
    private final void setUpCamera() {
    }
    
    @android.annotation.SuppressLint(value = {"UnsafeOptInUsageError"})
    private final void bindCameraUseCases() {
    }
    
    @java.lang.Override
    public void onConfigurationChanged(@org.jetbrains.annotations.NotNull
    android.content.res.Configuration newConfig) {
    }
    
    @java.lang.Override
    public void onResults(@org.jetbrains.annotations.Nullable
    java.util.List<org.tensorflow.lite.task.vision.detector.Detection> results, long inferenceTime, int imageHeight, int imageWidth) {
    }
    
    @java.lang.Override
    public void onError(@org.jetbrains.annotations.NotNull
    java.lang.String error) {
    }
}