package com.xworkz.isarelation.Internal;

public class Motorcycle extends Cycle{
    public Motorcycle(){
        System.out.println("no arg cont");
    }
    @Override
    public void pedal(){
        System.out.println("Running pedal updated");
    }
    @Override
    public void brake(){
        System.out.println("Running brake updated");
    }
    @Override
    public void wheels(){
        System.out.println("Running wheels updated");
    }
    @Override
    public void ringBell(){
        System.out.println("Running ringBell updated");
    }
    @Override
    public void stand(){
        System.out.println("Running stand updated");
    }
    public void service(){
        System.out.println("Running service");
    }
}
