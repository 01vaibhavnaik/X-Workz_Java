package com.xworkz.external;

import com.xworkz.Internal.BagRule;
import com.xworkz.Internal.BoxingRule;

public class Boxing implements BoxingRule {
    @Override
    public void useGuard() {
        System.out.println("useGuard");
    }

    @Override
    public void useGloves() {
        System.out.println("useGloves");
    }

    @Override
    public void useShoe() {
        System.out.println("useShoe");
    }

}
