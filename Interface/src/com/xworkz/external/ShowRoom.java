package com.xworkz.external;

import com.xworkz.Internal.ShowRoomRule;

public class ShowRoom implements ShowRoomRule {

    @Override
    public void timeToOpenShowRoom() {
        System.out.println("Time to open show room is 10:00 AM");
    }

    @Override
    public void timeToCloseShowRoom() {
        System.out.println("Time to close show room is 9:00 PM");
    }

    @Override
    public void timeToDisplayItems() {
        System.out.println("Time to display items is 11:00 AM");
    }

    @Override
    public void noFakeShowRoom() {
        System.out.println("No fake show room");
    }
}
