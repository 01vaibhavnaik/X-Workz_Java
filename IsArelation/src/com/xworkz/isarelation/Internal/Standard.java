package com.xworkz.isarelation.Internal;

public class Standard extends College{
    public Standard(){
        System.out.println("no arg cont of Std");
    }
    @Override
    public void studentName(){
        System.out.println("Running Name updated");
    }
    @Override
    public void studentNSub(){
        System.out.println("Running Subject updated");
    }
    @Override
    public void studentStd(){
        System.out.println("Running std updated");
    }
    @Override
    public void studentPercentage(){
        System.out.println("Running Percentage updated");
    }
    public  void studentAdd(){
        System.out.println("Running std address");
    }
}
