package com.xworkz.external;

import com.xworkz.Internal.TrafficRule;

public class TrafficRuleForPeople implements TrafficRule {

    @Override
    public void speedLimit() {
        System.out.println("Speed limit is 60km/h");
    }

    @Override
    public void noHorn() {
        System.out.println("No honking in silent zones");
    }

    @Override
    public void wearHelmet() {
        System.out.println("Wearing helmet is mandatory");
    }
    @Override
    public void trafficLight() {
        System.out.println("Traffic light rules apply");
    }
}
