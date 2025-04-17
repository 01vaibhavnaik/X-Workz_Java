package com.xworkz.Internal;

public interface HostelRule {


    void timeToGoOut();

    void timeToReturn();

    void timeToDoLaundry();

    default void dinnerTime() {
        System.out.println("Dinner time is 8 PM.");
    }
}
