package com.xwrokz.tostring.external;

public class Suitcase {
    private String brand;
    private int size;
    private String color;

    public Suitcase(String brand, int size, String color) {
        this.brand = brand;
        this.size = size;
        this.color = color;
        System.out.println("Suitcase class constructor running");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + "\nSize: " + this.size + "\nColor: " + this.color;
    }
    @Override
    public int hashCode(){
        return 78;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Suitcase){
            Suitcase suitcase1=this;
            Suitcase suitcase2=(Suitcase) obj;
            if(suitcase1.brand==suitcase2.brand && suitcase1.size== suitcase2.size && suitcase1.color ==suitcase2.color){
                return true;
            }
        }
        return false;
    }
}