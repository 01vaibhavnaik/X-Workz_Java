package com.xwrokz.tostring.external;

public class Mattress {
    private String brand;
    private int size;
    private String material;

    public Mattress(String brand, int size, String material) {
        this.brand = brand;
        this.size = size;
        this.material = material;
        System.out.println("Mattress class constructor running");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + "\nSize: " + this.size + "\nMaterial: " + this.material;
    }
    @Override
    public int hashCode(){
        return -2345678;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Mattress){
            Mattress mattress1=this;
            Mattress mattress2=(Mattress) obj;
            if(mattress1.size== mattress2.size && mattress1.material==mattress2.material){
                return true;
            }
        }
        return false;
    }
}
