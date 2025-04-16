package com.xworkz.external;

import com.xworkz.Internal.DoorRule;

public class Door implements DoorRule {

    @Override
    public void timeToOpenDoor() {
        System.out.println("Time to open door is 5 seconds");
    }

    @Override
    public void timeToCloseDoor() {
        System.out.println("Time to close door is 5 seconds");
    }

    @Override
    public void timeToLockDoor() {
        System.out.println("Time to lock door is 10 seconds");
    }
}
