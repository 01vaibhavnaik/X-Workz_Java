package com.xwrokz.tostring.external;

public class WashingMachine {
    private String brand;
    private int capacity;
    private String type;

    public WashingMachine(String brand, int capacity, String type) {
        this.brand = brand;
        this.capacity = capacity;
        this.type = type;
        System.out.println("WashingMachine class constructor running");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + "\nCapacity: " + this.capacity + "\nType: " + this.type;
    }
    @Override
    public int hashCode(){
        return 76548;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof WashingMachine){
            WashingMachine washingMachine1=this;
            WashingMachine washingMachine2=(WashingMachine) obj;
            if(washingMachine1.brand==washingMachine2.brand && washingMachine1.capacity== washingMachine2.capacity && washingMachine1.type ==washingMachine2.type){
                return true;
            }
        }
        return false;
    }
}