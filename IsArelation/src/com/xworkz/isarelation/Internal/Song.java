package com.xworkz.isarelation.Internal;

public class Song extends Music{
    public Song(){
        System.out.println("no arg cont");
    }
    @Override
    public void play(){
        System.out.println("Running play updated");
    }
    @Override
    public void pause(){
        System.out.println("Running pause updated");
    }
    @Override
    public void stop(){
        System.out.println("Running stop updated");
    }
    @Override
    public void adjustVolume(){
        System.out.println("Running adjustVolume updated");
    }
    @Override
    public void download(){
        System.out.println(" Running download updated");
    }
}
