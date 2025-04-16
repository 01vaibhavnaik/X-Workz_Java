package com.xwrokz.tostring.external;

public class Refrigerator {
    private String brand;
    private int capacity;
    private String color;

    public Refrigerator(String brand, int capacity, String color) {
        this.brand = brand;
        this.capacity = capacity;
        this.color = color;
        System.out.println("Refrigerator class constructor running");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + "\nCapacity: " + this.capacity + "\nColor: " + this.color;
    }
    @Override
    public int hashCode(){
        return 45767;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Refrigerator){
            Refrigerator refrigerator1=this;
            Refrigerator refrigerator2=(Refrigerator) obj;
            if(refrigerator1.capacity== refrigerator2.capacity && refrigerator1.brand== refrigerator2.brand && refrigerator1.color==refrigerator2.color){
                return true;
            }
        }
        return false;
    }
}
