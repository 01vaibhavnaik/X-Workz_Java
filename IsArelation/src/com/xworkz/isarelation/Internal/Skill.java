package com.xworkz.isarelation.Internal;

public class Skill extends MartialArt{
    public Skill(){
        System.out.println("no arg cont of Skill");
    }
    @Override
    public void kungFu(){
        System.out.println("Running karate updated");
    }
    @Override
    public void karate(){
        System.out.println("Running Kung fu updated");
    }
    @Override
    public void boxing(){
        System.out.println("Running boxing updated");
    }
    @Override
    public void wwe(){
        System.out.println("Running wwe updated");
    }
}
