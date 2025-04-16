package com.xworkz.external;

import com.xworkz.Internal.BankRule;

public class Bank implements BankRule {

    @Override
    public void timeToOpenBank() {
        System.out.println("Time to open bank is 9:00 AM");
    }

    @Override
    public void timeToCloseBank() {
        System.out.println("Time to close bank is 5:00 PM");
    }

    @Override
    public void timeToDepositMoney() {
        System.out.println("Time to deposit money is 10:00 AM");
    }
}
