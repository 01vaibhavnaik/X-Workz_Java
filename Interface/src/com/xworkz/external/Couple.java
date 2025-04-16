package com.xworkz.external;

import com.xworkz.Internal.CoupleRule;

public class Couple implements CoupleRule {

    @Override
    public void ruleToStartCouple() {
        System.out.println("Starting the couple...");
    }

    @Override
    public void toUnderstandCouple() {
        System.out.println("Understanding the couple...");
    }

    @Override
    public void toLoyaltyCouple() {
        System.out.println("Being loyal to the couple...");
    }
}
