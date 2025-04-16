package com.xwrokz.tostring.external;

public class SmartPhone {
    private String brand;
    private int storage;
    private boolean has5G;

    public SmartPhone(String brand, int storage, boolean has5G) {
        this.brand = brand;
        this.storage = storage;
        this.has5G = has5G;
        System.out.println("Smartphone class constructor running");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + "\nStorage: " + this.storage + " GB\n5G: " + this.has5G;
    }
    @Override
    public int hashCode(){
        return -8960;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof SmartPhone){
            SmartPhone smartPhone1=this;
            SmartPhone smartPhone2=(SmartPhone) obj;
            if(smartPhone1.brand== smartPhone2.brand && smartPhone1.storage== smartPhone2.storage && smartPhone1.has5G ==smartPhone2.has5G){
                return true;
            }
        }
        return false;
    }
}
