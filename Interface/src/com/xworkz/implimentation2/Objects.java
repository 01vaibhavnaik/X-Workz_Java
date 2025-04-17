package com.xworkz.implimentation2;

import com.xworkz.Internal.*;

public class Objects implements BagRule, Camera, ChairRule, ATMRule, ClockRule {


    @Override
    public void timeToWithdrawMoney() {
        System.out.println("Time To WithdrawMoney");
    }

    @Override
    public void timeToCheckBalance() {
        System.out.println("Time To CheckBalance");
    }

    @Override
    public void timeToChangePin() {
        System.out.println("Time To ChangePin");
    }

    @Override
    public void timeToPackBag() {
        System.out.println("Time To PackBag");
    }

    @Override
    public void timeToUnpackBag() {
        System.out.println("Time To UnpackBag");
    }

    @Override
    public void timeToCarryBag() {
        System.out.println("Time To CarryBag");
    }

    @Override
    public void timeToCapturePhoto() {
        System.out.println("Time To Capture Photo");
    }

    @Override
    public void timeToRecordVideo() {
        System.out.println("Time To Record Video");
    }

    @Override
    public void timeToZoomIn() {
        System.out.println("Time To Zoom In");
    }

    @Override
    public void noUnrulyBehavior() {
        System.out.println("No Unruly Behavior");
    }

    @Override
    public void noUnauthorizedAccess() {
        System.out.println("No Unauthorized Access");
    }

    @Override
    public void noDamageToProperty() {
        System.out.println("No Damage To Property");
    }

    @Override
    public void setAlarm() {
        System.out.println("Set Alarm");
    }

    @Override
    public void snoozeAlarm() {
        System.out.println("Snooze Alarm");
    }

    @Override
    public void resetAlarm() {
        System.out.println("Reset Alarm");
    }
}
