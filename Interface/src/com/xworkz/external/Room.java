package com.xworkz.external;

import com.xworkz.Internal.RoomRule;

public class Room implements RoomRule {

    @Override
    public void peopleInRoom() {
        System.out.println("People in the room");
    }

    @Override
    public void bedClean() {
        System.out.println("Bed is clean");
    }

    @Override
    public void keepClean() {
        System.out.println("Keep the room clean");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping in the room");
    }
}
