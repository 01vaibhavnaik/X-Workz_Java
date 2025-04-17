package com.xworkz.Internal;

public interface BottelRule {


    void timeToEmptyBottel();

    void timeToCleanBottel();

    void timeToCheckBottel();

    default void noFakeBottel() {
        System.out.println("No Fake Bottel");
    }
}
