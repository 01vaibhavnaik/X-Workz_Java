package com.xwrokz.tostring.external;

public class Microwave {
    private String brand;
    private int capacity;
    private String color;

    public Microwave(String brand, int capacity, String color) {
        this.brand = brand;
        this.capacity = capacity;
        this.color = color;
        System.out.println("Microwave class constructor running");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + "\nCapacity: " + this.capacity + "\nColor: " + this.color;
    }
    @Override
    public int hashCode(){
        return -3829;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Microwave){
            Microwave microwave1=this;
            Microwave microwave2=(Microwave) obj;
            if(microwave1.brand== microwave2.brand && microwave1.capacity== microwave2.capacity){
                return true;
            }
        }
        return false;
    }
}
