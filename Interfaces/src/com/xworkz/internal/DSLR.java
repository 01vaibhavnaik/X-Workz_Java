package com.xworkz.internal;

public class DSLR implements Camera {

    @Override
    public void takePicture() {
        System.out.println("Taking picture with DSLR camera");
    }

}
