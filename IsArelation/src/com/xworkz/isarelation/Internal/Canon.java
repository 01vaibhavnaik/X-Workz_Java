package com.xworkz.isarelation.Internal;

public class Canon extends Camera{
    public Canon(){
        System.out.println("no arg cont of canon");
    }
    @Override
    public void lens(){
        System.out.println("Running lens updated");
    }
    @Override
    public void price(){
        System.out.println("Running price updated");
    }
    @Override
    public void resolution(){
        System.out.println("Running resolution updated");
    }
    @Override
    public void focus(){
        System.out.println("Running focus updated");
    }
    @Override
    public void cameraType(){
        System.out.println("Running cameraType updated");
    }
    public void cameraPrice(){
        System.out.println("Running cameraPrice");
    }
}
