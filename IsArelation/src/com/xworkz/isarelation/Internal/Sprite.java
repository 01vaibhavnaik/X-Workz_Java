package com.xworkz.isarelation.Internal;

public class Sprite extends ColdDrink{
    public Sprite(){
        System.out.println("no arg cont");
    }
    @Override
    public void drink(){
        System.out.println("Running drink updated");
    }
    @Override
    public void chill(){
        System.out.println("Running chill updated");
    }
    @Override
    public void flavor(){
        System.out.println("Running flavor updated");
    }
    @Override
    public void fizz(){
        System.out.println("Running fizz updated");
    }
    @Override
    public void sugarContent(){
        System.out.println("Running sugarContent updated");
    }
    public void alcoholAmt(){
        System.out.println("Running alcoholAmt");
    }
}
