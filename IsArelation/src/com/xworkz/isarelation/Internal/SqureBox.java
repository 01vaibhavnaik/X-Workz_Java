package com.xworkz.isarelation.Internal;

public class SqureBox extends Box{
    public SqureBox(){
        System.out.println("no arg cont");
    }
    @Override
    public void BoxPrice(){
        System.out.println("Running BoxPrice updated");
    }
    @Override
    public void BoxType(){
        System.out.println("Running BoxType updated");

    }
    @Override
    public void BoxMfd(){
        System.out.println("Running BoxMfd updated");

    }
    public void CircleBox(){
        System.out.println("Running CircleBox updated");
    }
}
