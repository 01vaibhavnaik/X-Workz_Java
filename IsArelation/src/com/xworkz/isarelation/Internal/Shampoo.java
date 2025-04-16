package com.xworkz.isarelation.Internal;

public class Shampoo extends Product{
    public Shampoo(){
        System.out.println("no arg cont of shampoo");
    }
    @Override
    public void productBrand(){
        System.out.println("Running productBrand updated");
    }
    @Override
    public void productName(){
        System.out.println("Running productName updated");
    }
    @Override
    public void productPrice(){
        System.out.println("Running productPrice updated");
    }
    @Override
    public void productExp(){
        System.out.println("Running productExp updated");
    }
}
