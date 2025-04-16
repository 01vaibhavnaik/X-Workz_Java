package com.xworkz.isarelation.Internal;

public class Pappaya extends Fruits{
    public Pappaya(){
        System.out.println("no args cont of pappaya");
    }
    @Override
    public void typeOfFruit(){
        System.out.println("Running types of fruit updated");
    }
    @Override
    public void kilogram(){
        System.out.println("Running kg updated");
    }
    @Override
    public void fruitPrice(){
        System.out.println("Running Price updated");
    }
    @Override
    public void cut(){
        System.out.println("Running cut operation updated");
    }
    @Override
    public void eat(){
        System.out.println("Running eat operation updated");
    }
}
