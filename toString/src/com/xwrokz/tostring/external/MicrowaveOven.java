package com.xwrokz.tostring.external;

public class MicrowaveOven {
    private String brand;
    private int wattage;
    private String color;

    public MicrowaveOven(String brand, int wattage, String color) {
        this.brand = brand;
        this.wattage = wattage;
        this.color = color;
        System.out.println("MicrowaveOven class constructor running");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + "\nWattage: " + this.wattage + "\nColor: " + this.color;
    }
    @Override
    public int hashCode(){
        return 445782;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof MicrowaveOven){
            MicrowaveOven microwaveOven1=this;
            MicrowaveOven microwaveOven2=(MicrowaveOven) obj;
            if(microwaveOven1.brand== microwaveOven2.brand && microwaveOven1.color== microwaveOven2.color){
                return true;
            }
        }
        return false;
    }
}