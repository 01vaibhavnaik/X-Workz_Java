package com.xworkz.isarelation.Internal;

public class MatchBox extends Boxs{
    public MatchBox(){
        System.out.println("no arg cont");
    }
    @Override
    public void storeItems(){
        System.out.println("Running storeItems updated");
    }
    @Override
    public void open(){
        System.out.println("Running open updated");
    }
    @Override
    public void close(){
        System.out.println("Running close updated");
    }
    @Override
    public void material(){
        System.out.println("Running material updated");
    }
    @Override
    public void size(){
        System.out.println("Running size updated");
    }
    public  void price(){
        System.out.println("Running price");
    }
}
