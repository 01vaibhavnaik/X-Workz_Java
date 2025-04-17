package com.xworkz.Internal;

public interface ComputerRule {

    void timeToCompile();

    void timeToRun();

    void timeToExecute();

    default void noFakeComputer() {
        System.out.println("No Fake Computer");
    }


}
