package com.xworkz.external;

import com.xworkz.Internal.DrivingRule;

public class Drive implements DrivingRule {

    @Override
    public void timeToStartDriving() {
        System.out.println("Starting the car...");
    }

    @Override
    public void timeToStopDriving() {
        System.out.println("Stopping the car...");
    }

    @Override
    public void timeToParkCar() {
        System.out.println("Parking the car...");
    }

    @Override
    public void driveSafe() {
        System.out.println("Drive Safe");
    }
}
