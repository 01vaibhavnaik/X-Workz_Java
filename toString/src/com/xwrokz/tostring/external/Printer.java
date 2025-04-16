package com.xwrokz.tostring.external;

public class Printer {
    private String brand;
    private String type;
    private int resolution;

    public Printer(String brand, String type, int resolution) {
        this.brand = brand;
        this.type = type;
        this.resolution = resolution;
        System.out.println("Printer class constructor running");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + "\nType: " + this.type + "\nResolution: " + this.resolution;
    }
    @Override
    public int hashCode(){
        return -987654;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Printer){
            Printer printer1=this;
            Printer printer2=(Printer) obj;
            if(printer1.type== printer2.type && printer1.brand== printer2.brand){
                return true;
            }
        }
        return false;
    }
}