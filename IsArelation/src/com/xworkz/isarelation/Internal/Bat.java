package com.xworkz.isarelation.Internal;

public class Bat extends SportsEquipment{
    public Bat(){
        System.out.println("no arg cont");
    }
    @Override
    public void use(){
        System.out.println("Running use updated");
    }
    @Override
    public void durability(){
        System.out.println("Running durability updated");
    }
    @Override
    public void brand(){
        System.out.println("Running brand updated");
    }
    @Override
    public void maintenance(){
        System.out.println("Running maintenance updated");
    }
    @Override
    public void cost(){
        System.out.println("Running cost updated");
    }
    public void durable(){
        System.out.println("Running durable");
    }
}
