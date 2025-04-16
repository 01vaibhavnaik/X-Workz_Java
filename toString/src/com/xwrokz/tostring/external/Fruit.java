package com.xwrokz.tostring.external;

public class Fruit {
    private String fruitName;
    private int fruitKg  ;
    private int fruitPrice;


    public Fruit(String fruitName,int fruitKg,int fruitPrice){
        this.fruitName=fruitName;
        this.fruitKg=fruitKg;
        this.fruitPrice=fruitPrice;
        System.out.println("String ,int, int arg cont Running");
    }
    @Override
    public String toString(){
        return "Name Of Fruit:"+this.fruitName+" \nFruit KG:"+this.fruitKg+"\nFruit Price :"+this.fruitPrice;
    }
    @Override
    public int hashCode(){
        return 76378;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Fruit){
            Fruit fruit1=this;
            Fruit fruit2=(Fruit) obj;
            if(fruit1.fruitKg==fruit2.fruitKg){
                return true;
            }
        }
        return false;
    }
}
