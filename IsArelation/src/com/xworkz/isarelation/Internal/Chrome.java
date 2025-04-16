package com.xworkz.isarelation.Internal;

public class Chrome extends Browser{
    public Chrome(){
        System.out.println("no arg cont");
    }
    @Override
    public void open(){
        System.out.println("Running open updated");
    }
    @Override
    public void close(){
        System.out.println("Running close updated");
    }
    @Override
    public void navigate(){
        System.out.println("Running navigate updated");
    }
    @Override
    public void incognitoMode(){
        System.out.println("Running incognitoMode updated");
    }
    @Override
    public void extensions(){
        System.out.println("Running extensions updated");
    }
    public void netSpeed(){
        System.out.println("Running Net speed");
    }
}
