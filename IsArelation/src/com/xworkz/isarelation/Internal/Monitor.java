package com.xworkz.isarelation.Internal;

public class Monitor extends Display{
    public Monitor(){
        System.out.println("no arg cont");
    }
    @Override
    public void showImage(){
        System.out.println("Running showImage updated");
    }
    @Override
    public void resolution(){
        System.out.println("Running resolution updated");
    }
    @Override
    public void refreshRate(){
        System.out.println("Running refreshRate updated");
    }
    @Override
    public void brightness(){
        System.out.println("Running brightness updated");
    }
    @Override
    public void displayType(){
        System.out.println("Running displayType updated");
    }
    public void monitorPrice(){
        System.out.println("Running monitorPrice");
    }
}
