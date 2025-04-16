package com.xworkz.external;

import com.xworkz.Internal.BuildingRule;

public class Building implements BuildingRule {

    @Override
    public void timeToStartBuilding() {
        System.out.println("Starting the building...");
    }

    @Override
    public void timeToStopBuilding() {
        System.out.println("Stopping the building...");
    }

    @Override
    public void timeToCheckBuilding() {
        System.out.println("Checking the building...");
    }
}
