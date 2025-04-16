package com.xwrokz.tostring.external;

public class Animal {
    private String animalName;
    private String animalFound;
    private String animalColor;

    public Animal(String animalName,String animalFound,String animalColor){
        this.animalName=animalName;
        this.animalFound=animalFound;
        this.animalColor=animalColor;
        System.out.println("String ,String, String arg cont Running");
    }
    @Override
    public String toString(){
        return "Animal Name:"+this.animalName+" \nAnimal Found:"+this.animalFound+"\nAnimal Color:"+this.animalColor;
    }
    @Override
    public int hashCode(){
        return -89;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Animal){
            Animal animal1=this;
            Animal animal2=(Animal) obj;
            if(animal1.animalName==animal2.animalName ){
                return true;
            }
        }
        return false;
    }
}
