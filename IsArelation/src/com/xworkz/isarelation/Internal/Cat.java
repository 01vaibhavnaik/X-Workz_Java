package com.xworkz.isarelation.Internal;

public class Cat extends Animals{
    public Cat(){
        System.out.println("no arg cont of Cat");
    }
    @Override
    public void typeOfAnimals(){
        System.out.println("Running types of fruit updated");
    }
    @Override
    public void hunt(){
        System.out.println("Running Hunt updated");
    }
    @Override
    public void voice(){
        System.out.println("Running voice updated");
    }
    @Override
    public void prey(){
        System.out.println("Running prey updated");
    }
    @Override
    public void alive(){
        System.out.println("Running alive updated");
    }
}
