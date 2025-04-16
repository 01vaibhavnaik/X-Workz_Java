package com.xwrokz.tostring.external;

public class HairDryer {
    private String brand;
    private int power;
    private String color;

    public HairDryer(String brand, int power, String color) {
        this.brand = brand;
        this.power = power;
        this.color = color;
        System.out.println("HairDryer class constructor running");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + "\nPower: " + this.power + "\nColor: " + this.color;
    }
    @Override
    public int hashCode(){
        return -879;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof HairDryer){
            HairDryer hairDryer1=this;
            HairDryer hairDryer2=(HairDryer) obj;
            if(hairDryer1.brand== hairDryer2.brand && hairDryer1.power==hairDryer2.power){
                return true;
            }
        }
        return false;
    }
}
