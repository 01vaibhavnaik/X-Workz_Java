package com.xworkz.external;

import com.xworkz.Internal.BusRule;

public class Bus implements BusRule {

    @Override
    public void noEating() {
        System.out.println("No eating in the bus");
    }

    @Override
    public void noLittering() {
        System.out.println("No littering in the bus");
    }

    @Override
    public void noDisruption() {
        System.out.println("No disruption in the bus");
    }
}
