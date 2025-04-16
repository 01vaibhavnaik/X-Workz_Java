package com.xwrokz.tostring.external;

public class SmartWatch {
    private String brand;
    private boolean hasGPS;
    private boolean isWaterproof;

    public SmartWatch(String brand, boolean hasGPS, boolean isWaterproof) {
        this.brand = brand;
        this.hasGPS = hasGPS;
        this.isWaterproof = isWaterproof;
        System.out.println("Smartwatch class constructor running");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + "\nHas GPS: " + this.hasGPS + "\nIs Waterproof: " + this.isWaterproof;
    }
    @Override
    public int hashCode(){
        return -545678;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof SmartWatch){
            SmartWatch smartWatch1=this;
            SmartWatch smartWatch2=(SmartWatch) obj;
            if(smartWatch1.brand== smartWatch2.brand && smartWatch1.hasGPS== smartWatch2.hasGPS && smartWatch1.isWaterproof ==smartWatch2.isWaterproof){
                return true;
            }
        }
        return false;
    }
}