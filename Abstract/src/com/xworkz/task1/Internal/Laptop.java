package com.xworkz.task1.Internal;

public abstract class Laptop {
    private String name;
    private int price;
    private String processor;

    public Laptop(String name,int price,String processor){
        this.name=name;
        this.price=price;
        this.processor=processor;
    }
    public Laptop(String name,int price){
        this.name=name;
        this.price=price;

    }
    public Laptop(String name){
        this.name=name;


    }


    @Override
    public String toString() {
        return "Industry{" +
                "name='" + name + '\'' +
                ", product=" + price +
                ", room='" + processor + '\'' +
                '}';
    }
}
