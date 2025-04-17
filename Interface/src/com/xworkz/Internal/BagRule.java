package com.xworkz.Internal;

public interface BagRule {
    void timeToPackBag();

    void timeToUnpackBag();

    void timeToCarryBag();
    default void noFakeBag() {
        System.out.println("No Fake Bag");
    }



}
