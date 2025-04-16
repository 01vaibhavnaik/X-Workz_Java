package com.xworkz.isarelation.Internal;

public class Hearts extends Organ{
    public Hearts(){
        System.out.println("no arg cont");
    }
    @Override
    public void function(){
        System.out.println("Running function updated");
    }
    @Override
    public void bloodSupply(){
        System.out.println("Running bloodSupply updated");
    }
    @Override
    public void regulation(){
        System.out.println("Running regulation updated");
    }
    @Override
    public void growth(){
        System.out.println("Running growth updated");
    }
    @Override
    public void repair(){
        System.out.println("Running repair updated");
    }
    public void nerves(){
        System.out.println("Running nerves");
    }
}
