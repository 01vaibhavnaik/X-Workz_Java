package com.xwrokz.tostring.external;

public class Dog {
    private String breed;
    private int age;
    private String size;

    public Dog(String breed, int age, String size) {
        this.breed = breed;
        this.age = age;
        this.size = size;
        System.out.println("Dog class constructor running");
    }

    @Override
    public String toString() {
        return "Breed: " + this.breed + "\nAge: " + this.age + "\nSize: " + this.size;
    }
    @Override
    public int hashCode(){
        return 9879;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Cow){
            Dog dog1=this;
            Dog dog2=(Dog) obj;
            if(dog1.breed==dog2.breed){
                return true;
            }
        }
        return false;
    }
}