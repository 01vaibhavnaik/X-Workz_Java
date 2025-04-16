package com.xworkz.isarelation.Internal;

public class EyeDrop extends Drop{
    public EyeDrop(){
        System.out.println("no arg cont");
    }
    @Override
    public void liquidType(){
        System.out.println("Running liquidType updated");
    }
    @Override
    public void volume(){
        System.out.println("Running volume updated");
    }
    @Override
    public void uses(){
        System.out.println("Running use updated");
    }
    @Override
    public void absorption(){
        System.out.println("Running absorption updated");
    }
    @Override
    public void dispense(){
        System.out.println("Running dispense updated");
    }
    public void lens(){
        System.out.println("Running lens");
    }
}
