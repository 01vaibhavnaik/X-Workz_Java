package com.xworkz.isarelation.Internal;

public class Redmi extends  Mobiles{
    public Redmi(){
        System.out.println("no arg vcont of Redmi");
    }
    @Override
    public void deviceOn(){
        System.out.println("Running phone on updated");
    }
    @Override
    public void deviceRun(){
        System.out.println("Running phone Run updated");
    }
    @Override
    public void devicePlay(){
        System.out.println("Running phone Play updated");
    }
    @Override
    public void deviceBattery(){
        System.out.println("Running phone Battery updated");
    }
    @Override
    public void deviceStop(){
        System.out.println("Running phone Stop updated");
    }
}
