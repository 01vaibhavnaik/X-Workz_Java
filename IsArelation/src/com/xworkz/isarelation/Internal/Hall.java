package com.xworkz.isarelation.Internal;

public class Hall extends Home{
    public Hall(){
        System.out.println("no arg cont of Hall");
    }
    @Override
    public void HomeType(){
        System.out.println("Running HomeType updated");
    }
    @Override
    public void HomeLocation(){
        System.out.println("Running HomeLocation updated");
    }
    @Override
    public void HomePrice(){
        System.out.println("Running HomePrice updated");
    }
    @Override
    public void HomeQty(){
        System.out.println("Running HomeQty updated");
    }
    public void homeArea(){
        System.out.println("Running homeArea");
    }
}
