package com.xworkz.Internal;

public interface ProgramRule {
    void noDisrespect();
    void noDisruption();
    void noInappropriateContent();
    default void programDuration() {
        System.out.println("Program duration is 3 months");
    }

}
