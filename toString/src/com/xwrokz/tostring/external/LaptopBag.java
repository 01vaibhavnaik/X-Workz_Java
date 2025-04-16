package com.xwrokz.tostring.external;

public class LaptopBag {
    private String material;
    private int size;
    private String color;

    public LaptopBag(String material, int size, String color) {
        this.material = material;
        this.size = size;
        this.color = color;
        System.out.println("LaptopBag class constructor running");
    }

    @Override
    public String toString() {
        return "Material: " + this.material + "\nSize: " + this.size + "\nColor: " + this.color;
    }
    @Override
    public int hashCode(){
        return -79;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof LaptopBag){
            LaptopBag laptopBag1=this;
            LaptopBag laptopBag2=(LaptopBag) obj;
            if(laptopBag1.color== laptopBag2.color && laptopBag1.material==laptopBag2.material){
                return true;
            }
        }
        return false;
    }
}