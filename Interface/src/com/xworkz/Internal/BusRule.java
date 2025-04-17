package com.xworkz.Internal;

public interface BusRule {

    void noEating();
    void noLittering();
    void noDisruption();

    default void noFakeTickets() {
        System.out.println("No Fake Tickets");
    }

}
