package com.xwrokz.tostring.external;

public class Truck {
    private String model;
    private int capacity;
    private String engineType;

    public Truck(String model, int capacity, String engineType) {
        this.model = model;
        this.capacity = capacity;
        this.engineType = engineType;
        System.out.println("Truck class constructor running");
    }

    @Override
    public String toString() {
        return "Model: " + this.model + "\nCapacity: " + this.capacity + "\nEngine Type: " + this.engineType;
    }
    @Override
    public int hashCode(){
        return 678;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Truck){
            Truck truck1=this;
            Truck truck2=(Truck) obj;
            if(truck1.model==truck2.model && truck1.capacity== truck2.capacity && truck1.engineType ==truck2.engineType){
                return true;
            }
        }
        return false;
    }
}