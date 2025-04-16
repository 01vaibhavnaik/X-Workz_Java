package com.xworkz.implimentation1;

import com.xworkz.Internal.BoxingRule;
import com.xworkz.Internal.CoupleRule;

public class Fight implements BoxingRule, CoupleRule {
    @Override
    public void useGuard() {
        System.out.println("Use guard");
    }

    @Override
    public void useGloves() {
        System.out.println("Use gloves");
    }

    @Override
    public void useShoe() {
        System.out.println("Use shoe");
    }

    @Override
    public void ruleToStartCouple() {
        System.out.println("Rule to start couple");
    }

    @Override
    public void toUnderstandCouple() {
        System.out.println("To understand couple");
    }

    @Override
    public void toLoyaltyCouple() {
        System.out.println("To loyalty couple");
    }
}
