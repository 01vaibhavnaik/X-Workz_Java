package com.xworkz.isarelation.Internal;

public class Charcoal extends Coal{
    public Charcoal(){
        System.out.println("no arg cont");
    }
    @Override
    public void burn(){
        System.out.println("Running burn updated");
    }
    @Override
    public void generateEnergy(){
        System.out.println("Running generateEnergy updated");
    }
    @Override
    public void carbonContent(){
        System.out.println("Running carbonContent updated");
    }
    @Override
    public void extraction(){
        System.out.println("Running extraction updated");
    }
    @Override
    public void usage(){
        System.out.println("Running usage updated");
    }
    public void pollution(){
        System.out.println("Running pollution");
    }
}
