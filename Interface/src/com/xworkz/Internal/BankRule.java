package com.xworkz.Internal;

public interface BankRule {
    void timeToOpenBank();

    void timeToCloseBank();

    void timeToDepositMoney();

    default void noFakeBank() {
        System.out.println("No Fake Bank");
    }




}
