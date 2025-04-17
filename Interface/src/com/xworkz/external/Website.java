package com.xworkz.external;

import com.xworkz.Internal.BrowserRule;

public class Website implements BrowserRule {

    @Override
    public void noPopups() {
        System.out.println("No popups are allowed");
    }

    @Override
    public void noMalware() {
        System.out.println("No malware is allowed");
    }

    @Override
    public void noPhishing() {
        System.out.println("No phishing is allowed");
    }

    @Override
    public void noFakeWebsites() {
        System.out.println("No fake websites are allowed");
    }
}
