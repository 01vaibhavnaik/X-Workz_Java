package com.xworkz.Internal;

public interface SportCarRule {
    void noRacing();
    void noStreetRacing();
    void noIllegalModifications();

    default void carMaintenance() {
        System.out.println("Regular car maintenance is required.");
    }
}
