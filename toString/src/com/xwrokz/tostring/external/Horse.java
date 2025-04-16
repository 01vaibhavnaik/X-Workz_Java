package com.xwrokz.tostring.external;

public class Horse {
    private String breed;
    private String color;
    private int height;

    public Horse(String breed, String color, int height) {
        this.breed = breed;
        this.color = color;
        this.height = height;
        System.out.println("Horse class constructor running");
    }

    @Override
    public String toString() {
        return "Breed: " + this.breed + "\nColor: " + this.color + "\nHeight: " + this.height + " cm";
    }
    @Override
    public int hashCode(){
        return 3689;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Horse){
            Horse horse1=this;
            Horse horse2=(Horse) obj;
            if(horse1.color== horse2.color && horse1.height==horse2.height){
                return true;
            }
        }
        return false;
    }
}
