package com.xworkz.Internal;

public interface SecurityRule {
    void timeToSecureArea();

    void timeToCheckSecurity();

    void timeToReportIncident();

    default void noFakeSecurity() {
        System.out.println("No Fake Security");
    }
}
