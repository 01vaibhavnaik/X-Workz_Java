package com.xworkz.isarelation.Internal;

public class CreditCard extends Card{
    public CreditCard(){
        System.out.println("no arg cont");
    }
    @Override
    public void swipe(){
        System.out.println("Running swipe updated");
    }
    @Override
    public void insert(){
        System.out.println("Running insert updated");
    }
    @Override
    public void tap(){
        System.out.println("Running tap updated");
    }
    @Override
    public void validate(){
        System.out.println("Running validate updated");
    }
    @Override
    public void expire(){
        System.out.println(" Running expire updated");
    }
    public void debit(){
        System.out.println("Running debit card");
    }
}
