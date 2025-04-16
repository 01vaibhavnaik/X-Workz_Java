package com.xworkz.isarelation.Internal;

public class JackFruit extends Fruits{
    public JackFruit(){
        System.out.println("no arg cont of JackFruit");
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
