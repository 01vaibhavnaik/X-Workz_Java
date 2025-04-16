package com.xworkz.isarelation.Internal;

public class Pipe extends Steel{
    public Pipe(){
        System.out.println("no arg cont");
    }

    @Override
    public void steelType(){
        System.out.println("Running steelType updated");
    }
    @Override
    public void steelBrand(){
        System.out.println("Running steelBrand updated");
    }
    @Override
    public void steelPrice(){
        System.out.println("Running steelPrice updated");

    }
    @Override
    public void steelThickness(){
        System.out.println("Running steelThickness updated");

    }
}
