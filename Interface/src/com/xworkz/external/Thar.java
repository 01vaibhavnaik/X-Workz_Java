package com.xworkz.external;

import com.xworkz.Internal.OffRoadCarRule;

public class Thar implements OffRoadCarRule {

    @Override
    public void timeToRefuel() {
        System.out.println("Time to refuel.");
    }

    @Override
    public void timeToWash() {
        System.out.println("Time to wash.");
    }

    @Override
    public void timeToService() {
        System.out.println("Time to service.");
    }
}
