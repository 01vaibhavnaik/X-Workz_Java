package com.xworkz.Internal;

public interface TrafficRule {
    void speedLimit();
    void noHorn();
    void wearHelmet();

    default void trafficLight() {
        System.out.println("Follow traffic lights");
    }

}
