package com.xworkz.isarelation.Internal;

public class USBCable extends Port{
    public USBCable(){
        System.out.println("no arg cont");
    }
    @Override
    public void connect(){
        System.out.println("Running connect updated");
    }
    @Override
    public void transferData(){
        System.out.println("Running transferData updated");
    }
    @Override
    public void supplyPower(){
        System.out.println("Running supplyPower updated");
    }@Override
    public void type(){
        System.out.println("Running type updated");
    }

    public void charge(){
        System.out.println("Running Charge");
    }
}

