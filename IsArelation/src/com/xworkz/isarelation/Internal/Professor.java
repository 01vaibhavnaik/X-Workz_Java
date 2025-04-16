package com.xworkz.isarelation.Internal;

public class Professor extends Person{
    public Professor(){
        System.out.println("no arg cont");
    }
    @Override
    public void eat(){
        System.out.println("Running eat updated");
    }
    @Override
    public void sleep(){
        System.out.println("Running sleep updated");
    }
    @Override
    public void walk(){
        System.out.println("Running walk updated");
    }
    @Override
    public void talk(){
        System.out.println("Running talk updated");
    }
    @Override
    public void breathe(){
        System.out.println("Running breathe updated");
    }
}
