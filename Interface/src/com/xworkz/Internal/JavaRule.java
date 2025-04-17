package com.xworkz.Internal;

public interface JavaRule {
    void timeToCompileJava();

    void timeToRunJava();

    void timeToDebugJava();

    default void noFakeJava() {
        System.out.println("No Fake Java");
    }
}
