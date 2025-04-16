package com.xworkz.isarelation.Internal;

public class Fastrack extends Watch{
    public Fastrack(){
        System.out.println("no arg cont of Fastrack");
    }
    @Override
    public  void time(){
        System.out.println("Running time updated");
    }
    @Override
    public  void date(){
        System.out.println("Running date updated");
    }
    @Override
    public  void year(){
        System.out.println("Running year updated");
    }
    @Override
    public  void hour(){
        System.out.println("Running hour updated");
    }
    public void price(){
        System.out.println("Running price");
    }
}
