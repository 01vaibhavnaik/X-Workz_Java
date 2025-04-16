package com.xworkz.isarelation.Internal;

public class MacBook extends Laptop{
    public MacBook(){
        System.out.println("no arg cont MacBook");
    }
    @Override
    public void laptopType(){
        System.out.println("Running laptopType updated");
    }
    @Override
    public void laptopBrand(){
        System.out.println("Running laptopBrand updated");
    }
    @Override
    public void laptopOn(){
        System.out.println("Running laptopOn updated");
    }
    @Override
    public void laptopOff(){
        System.out.println("Running laptopOff updated");
    }
}
