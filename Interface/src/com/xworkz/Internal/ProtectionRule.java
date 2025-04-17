package com.xworkz.Internal;

public interface ProtectionRule {

    void timeToStopProtection();

    void timeToCheckProtection();

    void timeToCheckSecurity();

    default void noFakeProtection() {
        System.out.println("No Fake Protection");
    }
}
