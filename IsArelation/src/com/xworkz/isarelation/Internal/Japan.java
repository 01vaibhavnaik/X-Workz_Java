package com.xworkz.isarelation.Internal;

public class Japan extends Countrys{
    public Japan(){
        System.out.println("no arg cont");
    }
    @Override
    public void continent(){
        System.out.println("Running continent updated");
    }
    @Override
    public void population(){
        System.out.println("Running population updated");
    }
    @Override
    public void government(){
        System.out.println("Running government updated");
    }
    @Override
    public void currency(){
        System.out.println("Running currency updated");
    }
    @Override
    public void language(){
        System.out.println("Running language updated");
    }
    public void car(){
        System.out.println("Running car modificatin");
    }
}
