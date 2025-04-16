package com.xworkz.implimentation1;

import com.xworkz.Internal.RoomRule;
import com.xworkz.Internal.WashRoomRule;

public class Rooms implements WashRoomRule, RoomRule {
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

    @Override
    public void noLittering() {
        System.out.println("No littering");
    }

    @Override
    public void noVandalism() {
        System.out.println("No vandalism");
    }

    @Override
    public void noExcessiveNoise() {
        System.out.println("No excessive noise");
    }
}
