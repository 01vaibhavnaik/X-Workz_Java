package com.xworkz.Internal;

public interface MartRule {
    void timeToStartMart();

    void timeToStopMart();

    void timeToCheckMart();
    default void noFakeMart() {
        System.out.println("No Fake Mart");
    }


}
