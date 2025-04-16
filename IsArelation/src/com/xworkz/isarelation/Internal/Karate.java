package com.xworkz.isarelation.Internal;

public class Karate extends Skills{
    public Karate(){
        System.out.println("no arg cont of karate");
    }
    @Override
    public void learn(){
        System.out.println("Running learn updated");
    }
    @Override
    public void improve(){
        System.out.println("Running improve updated");
    }
    @Override
    public void apply(){
        System.out.println("Running apply updated");
    }
    @Override
    public void requiresEffort(){
        System.out.println("Running requiresEffort updated");
    }
    @Override
    public void hasLevels(){
        System.out.println("Running hasLevels updated");
    }
}
