package com.xworkz.isarelation.Internal;

public class CopperWire extends Wire{
    public CopperWire(){
        System.out.println("no arg cont");
    }
    @Override
    public void conductElectricity(){
        System.out.println("Running conductElectricity updated");
    }
    @Override
    public void insulation(){
        System.out.println("Running insulation updated");
    }
    @Override
    public void flexibility(){
        System.out.println("Running flexibility updated");
    }
    @Override
    public void length(){
        System.out.println("Running length updated");
    }
    @Override
    public void usage(){
        System.out.println("Running usage updated");
    }
    public void wireColors(){
        System.out.println("Running  wire color");
    }
}
