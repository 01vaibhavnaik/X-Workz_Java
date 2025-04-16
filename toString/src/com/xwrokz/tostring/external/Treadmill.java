package com.xwrokz.tostring.external;

public class Treadmill {
    private String brand;
    private int speedRange;
    private String color;

    public Treadmill(String brand, int speedRange, String color) {
        this.brand = brand;
        this.speedRange = speedRange;
        this.color = color;
        System.out.println("Treadmill class constructor running");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + "\nSpeed Range: " + this.speedRange + "\nColor: " + this.color;
    }
    @Override
    public int hashCode(){
        return -54876;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Treadmill){
            Treadmill treadmill1=this;
            Treadmill treadmill2=(Treadmill) obj;
            if(treadmill1.brand==treadmill2.brand && treadmill1.speedRange== treadmill2.speedRange && treadmill1.color ==treadmill2.color){
                return true;
            }
        }
        return false;
    }
}
