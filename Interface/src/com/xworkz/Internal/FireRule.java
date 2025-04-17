package com.xworkz.Internal;

public interface FireRule {
    void timeToExtinguishFire();

    void timeToEvacuate();

    void timeToCallEmergencyServices();

    default void noFakeFire() {
        System.out.println("No Fake Fire");
    }

}
