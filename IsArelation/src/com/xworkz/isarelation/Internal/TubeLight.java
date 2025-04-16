package com.xworkz.isarelation.Internal;

public class TubeLight extends Light{
    public TubeLight(){
        System.out.println("no arg cont");
    }
    @Override
    public void turnOn(){
        System.out.println("Running turnOn updated");
    }
    @Override
    public void turnOff(){
        System.out.println("Running turnOff updated");
    }
    @Override
    public void brightness(){
        System.out.println("Running brightness updated");
    }@Override
    public void color(){
        System.out.println("Running color updated");
    }
    @Override
    public void powerSource(){
        System.out.println("Running powerSource updated");
    }
    public void bill(){
        System.out.println("Running bill");
    }
}
