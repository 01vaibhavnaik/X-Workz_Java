package com.xworkz.isarelation.Internal;

public class Liver extends Human{
    public Liver(){
        System.out.println("no arg cont Liver");

    }
    @Override
    public void body(){
        System.out.println("Running Body updated");
    }
    @Override
    public void hand(){
        System.out.println("Running hand updated");
    }
    @Override
    public void leg(){
        System.out.println("Running leg updated");
    }
    @Override
    public void face(){
        System.out.println("Running face updated");
    }
    @Override
    public void eye(){
        System.out.println("Running eye updated");
    }
}
