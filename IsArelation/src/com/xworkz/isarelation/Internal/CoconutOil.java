package com.xworkz.isarelation.Internal;

public class CoconutOil extends Oil {
    public CoconutOil(){
        System.out.println("no arg cont");
    }
    @Override
    public void extract(){
        System.out.println("Running extract updated");
    }
    @Override
    public void store(){
        System.out.println("Running store updated");
    }
    @Override
    public void cook(){
        System.out.println("Running cook updated");
    }
    @Override
    public void viscosity(){
        System.out.println("Running viscosity updated");
    }
    @Override
    public void use(){
        System.out.println("Running use updated");

    }
}
