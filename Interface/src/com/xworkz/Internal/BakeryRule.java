package com.xworkz.Internal;

public interface BakeryRule {
    void washHand();
    void keepClean();
    void payBefore();

    default void wearMask() {
        System.out.println("Wearing a mask is mandatory in the bakery.");
    }
}
