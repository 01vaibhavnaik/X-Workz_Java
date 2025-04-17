package com.xworkz.Internal;

public interface CollageRule {
    void noRagging();
    void noSmoking();
    void noDrugs();

    default void staySilent() {
        System.out.println("Stay silent in the college");
    }

}
