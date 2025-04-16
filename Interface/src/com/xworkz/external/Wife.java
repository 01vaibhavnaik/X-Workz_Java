package com.xworkz.external;

import com.xworkz.Internal.WifeRule;

public class Wife implements WifeRule {

    @Override
    public void toRespectWife() {
        System.out.println("Respecting the wife...");
    }

    @Override
    public void toSupportWife() {
        System.out.println("Supporting the wife...");
    }

    @Override
    public void toLoveWife() {
        System.out.println("Loving the wife...");
    }
}
