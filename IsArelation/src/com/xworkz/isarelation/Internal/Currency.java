package com.xworkz.isarelation.Internal;

public class Currency extends Money{
    public Currency(){
        System.out.println("no arg cont");
    }
    @Override
    public void exchange(){
        System.out.println("Running exchange updated");
    }
    @Override
    public void value(){
        System.out.println("Running value updated");
    }
    @Override
    public void store(){
        System.out.println("Running store updated");
    }
    @Override
    public void transfer(){
        System.out.println("Running transfer updated");
    }
    @Override
    public void buyGoods(){
        System.out.println("Running buyGoods updated");
    }
    public void stock(){
        System.out.println("Running stock");
    }
}
