package com.xworkz.Internal;

public interface CleaningRule {
    void timeToCleanHouse();


    void timeToCleanCar();

    void timeToCleanBathroom();

    default void noFakeCleaning() {
        System.out.println("No Fake Cleaning");
    }


}
