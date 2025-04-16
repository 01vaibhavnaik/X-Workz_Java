package com.xworkz.isarelation.Internal;

public class Shirt extends Cloths{
    public Shirt(){
        System.out.println("no args cont of Shirt");
    }
    @Override
    public void clothPrice(){
        System.out.println("Running clothPrice updated");
    }
    @Override
    public void clothBrand(){
        System.out.println("Running clothBrand updated");
    }
    @Override
    public void clothQty(){
        System.out.println("Running clothQty updated");
    }
    @Override
    public void clothThickness(){
        System.out.println("Running clothThickness updated");
    }
    public void clothMfd(){
        System.out.println("Running clothMfd");
    }
}
