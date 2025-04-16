package com.xwrokz.tostring.external;
public class Lamp {
    private String brand;
    private String color;
    private int brightness;

    public Lamp(String brand, String color, int brightness) {
        this.brand = brand;
        this.color = color;
        this.brightness = brightness;
        System.out.println("Lamp class constructor running");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + "\nColor: " + this.color + "\nBrightness: " + this.brightness;
    }
    @Override
    public int hashCode(){
        return 28197;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Lamp){
            Lamp lamp1=this;
            Lamp lamp2=(Lamp) obj;
            if(lamp1.brand== lamp2.brand && lamp1.color==lamp2.color){
                return true;
            }
        }
        return false;
    }
}
