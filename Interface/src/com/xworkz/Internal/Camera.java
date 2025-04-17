package com.xworkz.Internal;

public interface Camera {


    void timeToCapturePhoto();

    void timeToRecordVideo();

    void timeToZoomIn();
    default void noFakeCamera() {
        System.out.println("No Fake Camera");
    }


}
