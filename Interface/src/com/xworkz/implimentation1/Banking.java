package com.xworkz.implimentation1;

import com.xworkz.Internal.ATMRule;
import com.xworkz.Internal.BankRule;

public class Banking implements ATMRule, BankRule {
    @Override
    public void timeToWithdrawMoney() {
        System.out.println("Time to withdraw money");
    }

    @Override
    public void timeToCheckBalance() {
        System.out.println("Time to check balance");
    }

    @Override
    public void timeToChangePin() {
        System.out.println("Time to change pin");
    }

    @Override
    public void timeToOpenBank() {
        System.out.println("Time to open bank");
    }

    @Override
    public void timeToCloseBank() {
        System.out.println("Time to close bank");
    }

    @Override
    public void timeToDepositMoney() {
        System.out.println("Time to deposit money");
    }
}
