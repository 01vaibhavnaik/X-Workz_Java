package com.xworkz.isarelation.Internal;

public class RCB extends Team{
    public RCB(){
        System.out.println("no arg cont");
    }
    @Override
    public void play(){
        System.out.println("Running play updated");
    }
    @Override
    public void train(){
        System.out.println("Running train updated");
    }
    @Override
    public void compete(){
        System.out.println("Running compete updated");
    }
    @Override
    public void strategize(){
        System.out.println("Running strategize updated");
    }
    @Override
    public void celebrate(){
        System.out.println("Running celebrate updated");
    }
}
