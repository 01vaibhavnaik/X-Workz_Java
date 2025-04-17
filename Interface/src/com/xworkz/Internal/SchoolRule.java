package com.xworkz.Internal;

public interface SchoolRule {
    void time();
    void uniform();
    void completeHomework();

    default void extraCurricular() {
        System.out.println("Participating in extra-curricular activities is encouraged.");
    }

}
