package com.xworkz.isarelation.Internal;

public class Sparrow extends Birds{
    public Sparrow(){
        System.out.println("no arg cont of Sparrow");
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
