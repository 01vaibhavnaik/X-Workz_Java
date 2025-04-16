package com.xworkz.isarelation.Internal;

public class Lunch extends Tiffin{
    public Lunch(){
        System.out.println("no arg cont of lunch");
    }
    @Override
    public void tiffinPrice(){
        System.out.println("Running tiffinPrice updated");
    }
    @Override
    public void tiffinType(){
        System.out.println("Running tiffinType updated");

    }
    @Override
    public void tiffinMfd(){
        System.out.println("Running tiffinMfd updated");

    }
}
