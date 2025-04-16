package com.xwrokz.tostring.external;

public class Speaker {
    private String brand;
    private int wattage;
    private String color;

    public Speaker(String brand, int wattage, String color) {
        this.brand = brand;
        this.wattage = wattage;
        this.color = color;
        System.out.println("Speaker class constructor running");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + "\nWattage: " + this.wattage + "\nColor: " + this.color;
    }
    @Override
    public int hashCode(){
        return -975678;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Speaker){
            Speaker speaker1=this;
            Speaker speaker2=(Speaker) obj;
            if(speaker1.brand==speaker2.brand && speaker1.wattage== speaker2.wattage && speaker1.color ==speaker2.color){
                return true;
            }
        }
        return false;
    }
}