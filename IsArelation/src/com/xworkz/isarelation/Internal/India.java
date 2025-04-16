package com.xworkz.isarelation.Internal;

public class India extends Country{
    public India(){
        System.out.println("no arg cont of india");
    }
    @Override
    public void countryPopulation(){
        System.out.println("Running countryPopulation updated");
    }
    @Override
    public void countryLocation(){
        System.out.println("Running countryLocation updated");
    }
    @Override
    public void countryName(){
        System.out.println("Running countryName updated");
    }
    @Override
    public void countryBan(){
        System.out.println("Running countryBan updated");
    }
    public void nationAnimal(){
        System.out.println("Running nationAnimal");
    }
}
