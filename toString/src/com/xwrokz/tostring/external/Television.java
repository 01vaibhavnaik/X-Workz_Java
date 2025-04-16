package com.xwrokz.tostring.external;

public class Television {
    private String brand;
    private int size;
    private String resolution;

    public Television(String brand, int size, String resolution) {
        this.brand = brand;
        this.size = size;
        this.resolution = resolution;
        System.out.println("Television class constructor running");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + "\nSize: " + this.size + "\nResolution: " + this.resolution;
    }
    @Override
    public int hashCode(){
        return 36898;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Television){
            Television television1=this;
            Television television2=(Television) obj;
            if(television1.brand==television2.brand && television1.size== television2.size && television1.resolution ==television2.resolution){
                return true;
            }
        }
        return false;
    }
}

