package com.xwrokz.tostring.external;

public class Plane {
    private String airline;
    private int seatingCapacity;
    private String engineType;

    public Plane(String airline, int seatingCapacity, String engineType) {
        this.airline = airline;
        this.seatingCapacity = seatingCapacity;
        this.engineType = engineType;
        System.out.println("Plane class constructor running");
    }

    @Override
    public String toString() {
        return "Airline: " + this.airline + "\nSeating Capacity: " + this.seatingCapacity + "\nEngine Type: " + this.engineType;
    }
    @Override
    public int hashCode(){
        return 2862;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Plane){
            Plane plane1=this;
            Plane plane2=(Plane) obj;
            if(plane1.airline== plane2.airline && plane1.seatingCapacity== plane2.seatingCapacity){
                return true;
            }
        }
        return false;
    }
}
