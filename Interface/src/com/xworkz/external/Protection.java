package com.xworkz.external;

import com.xworkz.Internal.ProtectionRule;

public class Protection implements ProtectionRule {

    @Override
    public void timeToStopProtection() {
        System.out.println("Stopping the protection...");
    }

    @Override
    public void timeToCheckProtection() {
        System.out.println("Checking the protection...");
    }

    @Override
    public void timeToCheckSecurity() {
        System.out.println("Checking the security...");
    }
    @Override
    public void noFakeProtection() {
        System.out.println("No fake protection");
    }
}
