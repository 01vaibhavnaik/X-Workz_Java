package com.xworkz.isarelation.Internal;

public class FingerPrint extends Human{
    public FingerPrint(){
        System.out.println("no arg cont of finger print");
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
