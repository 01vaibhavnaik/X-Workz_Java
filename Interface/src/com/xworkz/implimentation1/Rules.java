package com.xworkz.implimentation1;

import com.xworkz.Internal.ShowRoomRule;
import com.xworkz.Internal.TrafficRule;

public class Rules implements TrafficRule, ShowRoomRule {
    @Override
    public void timeToOpenShowRoom() {
        System.out.println("Time to open showroom");
    }

    @Override
    public void timeToCloseShowRoom() {
        System.out.println("Time to close showroom");
    }

    @Override
    public void timeToDisplayItems() {
        System.out.println("Time to display items");
    }

    @Override
    public void speedLimit() {
        System.out.println("Speed limit");
    }

    @Override
    public void noHorn() {
        System.out.println("No horn");
    }

    @Override
    public void wearHelmet() {
        System.out.println("Wear helmet");
    }
}
