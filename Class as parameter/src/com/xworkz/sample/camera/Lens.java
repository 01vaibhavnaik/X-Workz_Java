package com.xworkz.sample.camera;

public class Lens {
    public void run(Camera camera){
        System.out.println("Running run in Lens");
        if(camera!=null){
            camera.camera();
        }else {
            System.out.println("pointing to null");
        }
    }
}
