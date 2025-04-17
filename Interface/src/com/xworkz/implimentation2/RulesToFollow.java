package com.xworkz.implimentation2;

import com.xworkz.Internal.*;

public class RulesToFollow implements BakeryRule, BarberRule, BottelRule, ChairRule, ChildrenRule {
    @Override
    public void washHand() {
        System.out.println("Wash Hand");
    }

    @Override
    public void keepClean() {
        System.out.println("Keep Clean");

    }

    @Override
    public void payBefore() {
        System.out.println("Pay Before");
    }

    @Override
    public void timeToOpenBarberShop() {
        System.out.println("Time To Open Barber Shop");
    }

    @Override
    public void timeToCloseBarberShop() {
        System.out.println("TimeToCloseBarberShop");
    }

    @Override
    public void timeToCutHair() {
        System.out.println("TimeToCutHair");
    }

    @Override
    public void timeToEmptyBottel() {
        System.out.println("TimeToEmptyBottel");
    }

    @Override
    public void timeToCleanBottel() {
        System.out.println("TimeToCleanBottel");
    }

    @Override
    public void timeToCheckBottel() {
        System.out.println("TimeToCheckBottel");
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
    public void toLoveChildren() {
        System.out.println("To Love Children");
    }

    @Override
    public void toPlayWithChildren() {
        System.out.println("To Play With Children");
    }

    @Override
    public void toTeachChildren() {
        System.out.println("To Teach Children");

    }
}
