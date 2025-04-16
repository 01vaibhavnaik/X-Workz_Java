package com.xwrokz.tostring.external;

public class Tent {
    private String brand;
    private int capacity;
    private String color;

    public Tent(String brand, int capacity, String color) {
        this.brand = brand;
        this.capacity = capacity;
        this.color = color;
        System.out.println("Tent class constructor running");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + "\nCapacity: " + this.capacity + "\nColor: " + this.color;
    }
    @Override
    public int hashCode(){
        return 8765;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Tent){
            Tent tent1=this;
            Tent tent2=(Tent) obj;
            if(tent1.brand==tent2.brand && tent1.capacity== tent2.capacity && tent1.color ==tent2.color){
                return true;
            }
        }
        return false;
    }
}