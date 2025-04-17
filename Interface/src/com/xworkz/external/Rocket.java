package com.xworkz.external;

import com.xworkz.Internal.RocketRule;

public class Rocket implements RocketRule {

    @Override
    public void timeToLaunchRocket() {
        System.out.println("Launching the rocket...");
    }

    @Override
    public void timeToLandRocket() {
        System.out.println("Landing the rocket...");
    }

    @Override
    public void timeToRefuelRocket() {
        System.out.println("Refueling the rocket...");
    }

    @Override
    public void  noFakeRocket() {
        System.out.println("No fake rocket");
    }
}
