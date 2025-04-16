package com.xworkz.isarelation.Internal;

public class Watchs extends Clock{
    public Watchs(){
        System.out.println("no arg cont");
    }
    @Override
    public void showTime(){
        System.out.println("Running showTime updated");
    }
    @Override
    public void setAlarm(){
        System.out.println("Running setAlarm updated");
    }
    @Override
    public void tick(){
        System.out.println("Running tick updated");
    }
    @Override
    public void displayFormat(){
        System.out.println("Running displayFormat updated");
    }
    @Override
    public void powerSource(){
        System.out.println("Running powerSource updated");
    }
    public void watchCmp(){
        System.out.println("Running Watch cmp");
    }
}
