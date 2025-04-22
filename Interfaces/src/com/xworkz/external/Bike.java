package com.xworkz.external;

import com.xworkz.internal.Vehicle;

public class Bike {
    private Vehicle vehicle;

    public Bike(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public void display() {
        System.out.println("Bike is running");
        if (vehicle != null) {
            this.vehicle.starEngine();
        } else {
            System.err.println("Null");
        }
    }
}
