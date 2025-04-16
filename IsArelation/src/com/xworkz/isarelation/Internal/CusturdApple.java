package com.xworkz.isarelation.Internal;

public class CusturdApple extends Tree{
    public CusturdApple(){
        System.out.println("no arg cont of custurdApple");
    }
    @Override
    public void branch(){
        System.out.println("Running branch updated");
    }
    @Override
    public void leaves(){
        System.out.println("Running leaves updated");
    }
    @Override
    public void roots(){
        System.out.println("Running roots updated");
    }
    @Override
    public void water(){
        System.out.println("Running water updated");
    }


}
