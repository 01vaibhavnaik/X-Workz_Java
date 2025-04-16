package com.xworkz.isarelation.Internal;

public class NewsPaper extends Paper {
    public NewsPaper(){
        System.out.println("no arg cont of newspaper");
    }
    @Override
    public void paperPrice(){
        System.out.println("Running paperPrice updated");
    }
    @Override
    public void paperType(){
        System.out.println("Running paperType updated");

    }
    @Override
    public void paperMfd(){
        System.out.println("Running paperMfd updated");

    }
}
