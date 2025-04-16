package com.xwrokz.tostring.external;

public class Cat {
    private String breed;
    private int age;
    private String color;

    public Cat(String breed, int age, String color) {
        this.breed = breed;
        this.age = age;
        this.color = color;
        System.out.println("Cat class constructor running");
    }

    @Override
    public String toString() {
        return "Breed: " + this.breed + "\nAge: " + this.age + "\nColor: " + this.color;
    }
    @Override
    public int hashCode(){
        return -35627;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Cat){
            Cat cat1=this;
            Cat cat2=(Cat) obj;
            if(cat1.breed==cat2.breed){
                return true;
            }
        }
        return false;
    }
}
