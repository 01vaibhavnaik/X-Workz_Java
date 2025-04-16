package com.xworkz.external;

import com.xworkz.Internal.Camera;

public class Focus implements Camera {

    @Override
    public void timeToCapturePhoto() {
        System.out.println("Time to capture photo is 5 seconds");
    }

    @Override
    public void timeToRecordVideo() {
        System.out.println("Time to record video is 10 seconds");
    }

    @Override
    public void timeToZoomIn() {
        System.out.println("Time to zoom in is 2 seconds");
    }
}
