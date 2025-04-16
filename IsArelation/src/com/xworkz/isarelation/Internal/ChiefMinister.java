package com.xworkz.isarelation.Internal;

public class ChiefMinister extends Minister {
    public ChiefMinister(){
        System.out.println("no arg cont");
    }
    @Override
    public void makePolicies(){
        System.out.println("Running makePolicies updated");
    }
    @Override
    public void implementLaws(){
        System.out.println("Running implementLaws updated");
    }
    @Override
    public void attendMeetings(){
        System.out.println("Running attendMeetings updated");
    }
    @Override
    public void representGovernment(){
        System.out.println("Running representGovernment updated");
    }
    @Override
    public void manageDepartment(){
        System.out.println("Running manageDepartment updated");
    }
    public void power(){
        System.out.println("Running power");
    }
}
