package com.xwrokz.tostring.external;

public class VaccumeCleaner {
    private String brand;
    private int power;
    private String color;

    public VaccumeCleaner(String brand, int power, String color) {
        this.brand = brand;
        this.power = power;
        this.color = color;
        System.out.println("VacuumCleaner class constructor running");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + "\nPower: " + this.power + "\nColor: " + this.color;
    }
    @Override
    public int hashCode(){
        return 87654;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof VaccumeCleaner){
            VaccumeCleaner vaccumeCleaner1=this;
            VaccumeCleaner vaccumeCleaner2=(VaccumeCleaner) obj;
            if(vaccumeCleaner1.brand==vaccumeCleaner2.brand && vaccumeCleaner1.power== vaccumeCleaner2.power && vaccumeCleaner1.color ==vaccumeCleaner2.color){
                return true;
            }
        }
        return false;
    }
}

