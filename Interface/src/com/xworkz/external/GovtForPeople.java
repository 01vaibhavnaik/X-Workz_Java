package com.xworkz.external;

import com.xworkz.Internal.GovtRule;

public class GovtForPeople implements GovtRule {

    @Override
    public void noCorruption() {
        System.out.println("No corruption in the government");
    }

    @Override
    public void noTerrorism() {
        System.out.println("No Terrorism");
    }

    @Override
    public void noCrime() {
        System.out.println("No crime in the country");
    }

    @Override
    public void noFakeNews() {
        System.out.println("No fake news in the country");
    }
}
