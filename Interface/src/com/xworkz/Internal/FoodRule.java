package com.xworkz.Internal;

public interface FoodRule {
    void noEating();

    void noWasting();

    void eatComplete();

    default void noFakeFood() {
        System.out.println("No Fake Food");
    }
}
