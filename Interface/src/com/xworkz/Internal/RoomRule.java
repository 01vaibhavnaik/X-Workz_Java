package com.xworkz.Internal;

public interface RoomRule {
    void peopleInRoom();
    void bedClean();
    void keepClean();

    default void sleep() {
        System.out.println("Sleeping in the room");
    }

}
