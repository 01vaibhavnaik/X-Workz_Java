package com.xwrokz.tostring.external;

public class Trolley {
    private String brand;
    private String material;
    private String color;

    public Trolley(String brand, String material, String color) {
        this.brand = brand;
        this.material = material;
        this.color = color;
        System.out.println("Trolley class constructor running");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + "\nMaterial: " + this.material + "\nColor: " + this.color;
    }
    @Override
    public int hashCode(){
        return -578;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Trolley){
            Trolley trolley1=this;
            Trolley trolley2=(Trolley) obj;
            if(trolley1.brand==trolley2.brand && trolley1.material== trolley2.material && trolley1.color ==trolley2.color){
                return true;
            }
        }
        return false;
    }
}