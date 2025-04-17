package com.xworkz.Internal;

public interface GovtRule {
    void noCorruption();
    void noTerrorism();
    void noCrime();

    default void noFakeNews() {
        System.out.println("No Fake News");
    }

}
