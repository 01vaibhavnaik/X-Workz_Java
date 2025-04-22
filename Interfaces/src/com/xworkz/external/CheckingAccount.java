package com.xworkz.external;

import com.xworkz.internal.Account;

public class CheckingAccount {
    private Account account;

    public CheckingAccount(Account account) {
        this.account = account;
    }

    public void createAccount() {
        if(account != null) {
            account.createAccount();
        } else {
            System.out.println("No account provided");
        }
    }
}
