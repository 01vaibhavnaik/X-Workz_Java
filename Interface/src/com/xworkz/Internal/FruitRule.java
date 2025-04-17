package com.xworkz.Internal;

public interface FruitRule {


    void timeToCut();

    void timeToPeel();

    void timeToSlice();
    default void noFakeFruit() {
        System.out.println("No Fake Fruit");
    }

}
