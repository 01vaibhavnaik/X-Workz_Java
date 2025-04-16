package com.xwrokz.tostring.external;

public class Blender {
    private String brand;
    private int speedLevels;
    private String color;

    public Blender(String brand, int speedLevels, String color) {
        this.brand = brand;
        this.speedLevels = speedLevels;
        this.color = color;
        System.out.println("Blender class constructor running");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + "\nSpeed Levels: " + this.speedLevels + "\nColor: " + this.color;
    }
    @Override
    public int hashCode(){
        return 68;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Blender){
            Blender blender1=this;
            Blender blender2=(Blender) obj;
            if(blender1.speedLevels==blender2.speedLevels ){
                return true;
            }
        }
        return false;
    }
}
