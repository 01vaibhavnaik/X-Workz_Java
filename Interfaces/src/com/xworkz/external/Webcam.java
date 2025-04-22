package com.xworkz.external;

import com.xworkz.internal.Camera;

public class Webcam {
    private Camera camera;

    public Webcam(Camera camera) {
        this.camera = camera;
    }
    public void captureImage() {
        if (camera != null) {
            camera.takePicture();
        } else {
            System.out.println("Null");
        }
    }
}
