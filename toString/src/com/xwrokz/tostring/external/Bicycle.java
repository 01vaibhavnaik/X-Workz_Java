package com.xwrokz.tostring.external;

public class Bicycle {
    private String brand;
    private int wheelSize;
    private String type;

    public Bicycle(String brand, int wheelSize, String type) {
        this.brand = brand;
        this.wheelSize = wheelSize;
        this.type = type;
        System.out.println("Bicycle class constructor running");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + "\nWheel Size: " + this.wheelSize + "\nType: " + this.type;
    }
    @Override
    public int hashCode(){
        return 763;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Bicycle){
            Bicycle bicycle1=this;
            Bicycle bicycle2=(Bicycle) obj;
            if(bicycle1.type==bicycle2.type ){
                return true;
            }
        }
        return false;
    }
}