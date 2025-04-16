package com.xworkz.isarelation.Internal;

public class Parrot extends Birds{
    public Parrot(){
        System.out.println("No arg cont of Parrot");
    }
    @Override
    public void fly(){
        System.out.println("Running fly updated");
    }
    @Override
    public void migrate(){
        System.out.println("Running migrate updated");
    }
    @Override
    public void Swim(){
        System.out.println("Running Swim updated");
    }
    @Override
    public void poop(){
        System.out.println("Running poop updated");
    }
    @Override
    public void speed(){
        System.out.println("Running speed updated");
    }
}
