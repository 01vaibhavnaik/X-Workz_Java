package com.xwrokz.tostring.external;

public class Camera {
    private String brand;
    private int megapixels;
    private String lensType;

    public Camera(String brand, int megapixels, String lensType) {
        this.brand = brand;
        this.megapixels = megapixels;
        this.lensType = lensType;
        System.out.println("Camera class constructor running");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + "\nMegapixels: " + this.megapixels + "\nLens Type: " + this.lensType;
    }
    @Override
    public int hashCode(){
        return -5678;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Camera){
            Camera camera1=this;
            Camera camera2=(Camera) obj;
            if(camera1.brand==camera2.brand ){
                return true;
            }
        }
        return false;
    }
}


