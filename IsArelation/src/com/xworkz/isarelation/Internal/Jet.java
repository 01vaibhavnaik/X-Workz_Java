package com.xworkz.isarelation.Internal;

public class Jet extends Airplane{
    public Jet(){
        System.out.println("no arg cont");
    }
    @Override
    public void takeOff(){
        System.out.println("Running takeOff updated");
    }
    @Override
    public void fly(){
        System.out.println("Running fly updated");
    }
    @Override
    public void land(){
        System.out.println("Running land updated");
    }
    @Override
    public void fuelCapacity(){
        System.out.println("Running fuelCapacityipe updated");
    }
    @Override
    public void passengers(){
        System.out.println("Running passengers updated");
    }
    public void space(){
        System.out.println("Running space");
    }
}
