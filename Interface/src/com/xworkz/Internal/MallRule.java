package com.xworkz.Internal;

public interface MallRule {
    void timeToStartMall();
    void timeToStopMall();
    void timeToCheckMall();
    default void noFakeMall() {
        System.out.println("No Fake Mall");
    }
}
