package com.xworkz.isarelation.Internal;

public class WoodenDoor extends Doors{
    public WoodenDoor(){
        System.out.println("no arg cont");
    }
    @Override
    public void open(){
        System.out.println("Running open updated");
    }
    @Override
    public void close(){
        System.out.println("Running close updated");
    }
    @Override
    public void lock(){
        System.out.println("Running lock updated");
    }
    @Override
    public void unlock(){
        System.out.println("Running unlock updated");
    }
    @Override
    public void material(){
        System.out.println("Running material updated");
    }
    public void safety(){
        System.out.println("Running Safety");
    }
}
