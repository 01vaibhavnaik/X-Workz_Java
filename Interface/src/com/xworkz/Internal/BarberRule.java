package com.xworkz.Internal;

public interface BarberRule {
    void timeToOpenBarberShop();

    void timeToCloseBarberShop();

    void timeToCutHair();

    default void noFakeBarberShop() {
        System.out.println("No Fake Barber Shop");
    }


}
