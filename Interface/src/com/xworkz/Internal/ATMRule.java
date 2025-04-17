package com.xworkz.Internal;

public interface ATMRule {
    void timeToWithdrawMoney();

    void timeToCheckBalance();

    void timeToChangePin();

    default void timeToDepositMoney() {
        System.out.println("Time to deposit money is 10:00 AM to 5:00 PM");
    }


}
