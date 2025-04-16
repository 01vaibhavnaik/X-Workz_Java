package com.xwrokz.tostring.external;

public class Car {
    private String model;
    private int year;
    private String color;

    public Car(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
        System.out.println("Car class constructor running");
    }

    @Override
    public String toString() {
        return "Model: " + this.model + "\nYear: " + this.year + "\nColor: " + this.color;
    }
    @Override
    public int hashCode(){
        return -739;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Car){
            Car car1=this;
            Car car2=(Car) obj;
            if(car1.model==car2.model){
                return true;
            }
        }
        return false;
    }
}
