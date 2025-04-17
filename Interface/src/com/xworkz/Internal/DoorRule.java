package com.xworkz.Internal;

public interface DoorRule {
    void timeToOpenDoor();

    void timeToCloseDoor();

    void timeToLockDoor();

    default void noFakeDoor() {
        System.out.println("No Fake Door");
    }


}
