package com.xworkz.implimentation1;

import com.xworkz.Internal.BuildingRule;
import com.xworkz.Internal.RoomRule;

public class Build implements RoomRule, BuildingRule {
    @Override
    public void timeToStartBuilding() {
        System.out.println("Time to start building");
    }

    @Override
    public void timeToStopBuilding() {
        System.out.println("Time to stop building");
    }

    @Override
    public void timeToCheckBuilding() {
        System.out.println("Time to check building");
    }

    @Override
    public void peopleInRoom() {
        System.out.println("People in room");
    }

    @Override
    public void bedClean() {
        System.out.println("Bed clean");
    }

    @Override
    public void keepClean() {
        System.out.println("Keep clean");
    }
}
