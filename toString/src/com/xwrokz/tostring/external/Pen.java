package com.xwrokz.tostring.external;

public class Pen {
    private String brand;
    private String color;
    private double length;

    public Pen(String brand, String color, double length) {
        this.brand = brand;
        this.color = color;
        this.length = length;
        System.out.println("Pen class constructor running");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + "\nColor: " + this.color + "\nLength: " + this.length;
    }
    @Override
    public int hashCode(){
        return 2680;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Pen){
            Pen pen1=this;
            Pen pen2=(Pen) obj;
            if(pen1.brand== pen2.brand && pen1.color== pen2.color){
                return true;
            }
        }
        return false;
    }
}
