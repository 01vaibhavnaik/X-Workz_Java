package com.xworkz.isarelation.Internal;

public class Goa extends Place{
    public Goa(){
        System.out.println("no arg cont of goa");
    }
    @Override
    public void placeOpen(){
        System.out.println("Running Open updated");
    }
    @Override
    public void placeName(){
        System.out.println("Running placeName updated");
    }
    @Override
    public void placeLocation(){
        System.out.println("Running placeLocation updated");
    }
    @Override
    public void placeClose(){
        System.out.println("Running Close updated");
    }
    public void beverage(){
        System.out.println("Running beverages");
    }
}
