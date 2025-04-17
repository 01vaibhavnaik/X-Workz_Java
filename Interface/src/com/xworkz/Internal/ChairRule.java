package com.xworkz.Internal;

public interface ChairRule {
    void noUnrulyBehavior();
    void noUnauthorizedAccess();
    void noDamageToProperty();

    default void fourLegs() {
        System.out.println("Chair has four legs");
    }
}
