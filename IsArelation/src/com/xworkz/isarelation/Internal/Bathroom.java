package com.xworkz.isarelation.Internal;

public class Bathroom extends Room{
    public Bathroom(){
        System.out.println("no arg cont");
    }
    @Override
    public void openDoor(){
        System.out.println("Running openDoor updated");
    }
    @Override
    public void closeDoor(){
        System.out.println("Running closeDoor updated");
    }
    @Override
    public void clean(){
        System.out.println("Running clean updated");
    }
    @Override
    public void ventilate(){
        System.out.println("Running ventilate updated");
    }
    @Override
    public void occupy(){
        System.out.println("Running occupy updated");
    }
    public void ac(){
        System.out.println("Running Ac");
    }
}
