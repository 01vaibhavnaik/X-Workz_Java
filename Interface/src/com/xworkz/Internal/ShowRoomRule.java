package com.xworkz.Internal;

public interface ShowRoomRule {
    void timeToOpenShowRoom();

    void timeToCloseShowRoom();

    void timeToDisplayItems();

    default void noFakeShowRoom() {
        System.out.println("No Fake Show Room");
    }

}
