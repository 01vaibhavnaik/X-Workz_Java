package com.xworkz.isarelation.Internal;

public class Lambo extends Vehicle{
    public Lambo(){
        System.out.println("no args cont of Lambo");
    }
    @Override
    public void drive() {
        System.out.println("Running drive updated");
    }
    @Override
    public void start() {
        System.out.println("Running start the vehicle updated");
    }
    @Override
    public void stop () {
        System.out.println("Running stop the vehicle updated");
    }
    @Override
    public void speed() {
        System.out.println("Running speed updated");
    }
    @Override
    public void color() {
        System.out.println("Color of vehicle updated");
    }
}
