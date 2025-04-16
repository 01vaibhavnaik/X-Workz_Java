package com.xworkz.external;

import com.xworkz.Internal.SecurityRule;

public class Security implements SecurityRule {

    @Override
    public void timeToSecureArea() {
        System.out.println("Securing the area...");
    }

    @Override
    public void timeToCheckSecurity() {
        System.out.println("Checking security protocols...");
    }

    @Override
    public void timeToReportIncident() {
        System.out.println("Reporting incident to authorities...");
    }
}
