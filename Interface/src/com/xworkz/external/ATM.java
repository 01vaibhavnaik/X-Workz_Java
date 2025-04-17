package com.xworkz.external;

import com.xworkz.Internal.ATMRule;

public class ATM implements ATMRule {

    @Override
    public void timeToWithdrawMoney() {
        System.out.println("Withdrawing money from ATM...");
    }

    @Override
    public void timeToCheckBalance() {
        System.out.println("Checking balance at ATM...");
    }

    @Override
    public void timeToChangePin() {
        System.out.println("Changing PIN at ATM...");
    }

    @Override
    public void timeToDepositMoney() {
        System.out.println("Depositing money at ATM...");
    }
}
