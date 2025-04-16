package com.xworkz.external;

import com.xworkz.Internal.FireRule;

public class Fire implements FireRule {

    @Override
    public void timeToExtinguishFire() {
        System.out.println("Time to extinguish fire");
    }

    @Override
    public void timeToEvacuate() {
        System.out.println("Time to evacuate");
    }

    @Override
    public void timeToCallEmergencyServices() {
        System.out.println("Time to call emergency services");
    }
}
