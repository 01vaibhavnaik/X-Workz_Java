package com.xworkz.Internal;

public interface CoupleRule {
    void ruleToStartCouple();
    void toUnderstandCouple();
    void toLoyaltyCouple();
    default void noFakeCouple() {
        System.out.println("No Fake Couple");
    }
}
