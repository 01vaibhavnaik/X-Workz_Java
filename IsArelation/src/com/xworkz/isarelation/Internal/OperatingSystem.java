package com.xworkz.isarelation.Internal;

public class OperatingSystem extends Software{
    public OperatingSystem(){
        System.out.println("no arg cont");
    }
    @Override
    public void install(){
        System.out.println("Running install updated");
    }
    @Override
    public void run(){
        System.out.println("Running run updated");
    }
    @Override
    public void update(){
        System.out.println("Running update updated");
    }
    @Override
    public void uninstall(){
        System.out.println("Running uninstall updated");
    }
    @Override
    public void configure(){
        System.out.println("Running configure updated");
    }
}
