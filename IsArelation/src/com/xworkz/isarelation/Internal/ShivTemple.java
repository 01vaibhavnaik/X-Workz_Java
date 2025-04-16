package com.xworkz.isarelation.Internal;

public class ShivTemple extends Temple{
    public ShivTemple(){
        System.out.println("no arg cont of Shiv");
    }
    @Override
    public void templeOpen(){
        System.out.println("Running Open updated");
    }
    @Override
    public void templeTirth(){
        System.out.println("Running Tirth updated");
    }
    @Override
    public void templePrasad(){
        System.out.println("Running Prasad updated");
    }
    @Override
    public void templeClose(){
        System.out.println("Running Close updated");
    }
    public void templeFest(){
        System.out.println("Running temple fest");
    }
}
