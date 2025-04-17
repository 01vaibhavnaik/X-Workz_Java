package com.xworkz.Internal;

public interface ParlimentRule {
    void timeToOpenParliment();

    void timeToCloseParliment();

    void timeToDiscussBills();

    default void noFakeParliment() {
        System.out.println("No Fake Parliment");
    }


}
