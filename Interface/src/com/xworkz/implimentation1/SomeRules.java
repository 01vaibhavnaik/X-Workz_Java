package com.xworkz.implimentation1;

import com.xworkz.Internal.DrivingRule;
import com.xworkz.Internal.WifeRule;

public class SomeRules implements DrivingRule, WifeRule {
    @Override
    public void timeToStartDriving() {
        System.out.println("Time to start driving");
    }

    @Override
    public void timeToStopDriving() {
        System.out.println("Time to stop driving");
    }

    @Override
    public void timeToParkCar() {
        System.out.println("Time to park car");
    }

    @Override
    public void toRespectWife() {
        System.out.println("To respect wife");
    }

    @Override
    public void toSupportWife() {
        System.out.println("To support wife");
    }

    @Override
    public void toLoveWife() {
        System.out.println("To love wife");
    }
}
