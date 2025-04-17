package com.xworkz.Internal;

public interface DrivingRule {
    void timeToStartDriving();

    void timeToStopDriving();

    void timeToParkCar();

    default void driveSafe() {
        System.out.println("Drive Safe");
    }


}
