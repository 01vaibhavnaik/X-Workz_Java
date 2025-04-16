package com.xworkz.isarelation.Internal;

public class Hammer extends Tool{
    public Hammer(){
        System.out.println("no arg cont");
    }
    @Override
    public void use(){
        System.out.println("running use updated");
    }
    @Override
    public void maintain(){
        System.out.println("running maintain updated");
    }
    @Override
    public void store(){
        System.out.println("running store updated");
    }
    @Override
    public void clean(){
        System.out.println("running clean updated");
    }
    @Override
    public void repair(){
        System.out.println("running repair updated");
    }
    public void size(){
        System.out.println("Running size");
    }
}
