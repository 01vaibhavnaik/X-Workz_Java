package com.xwrokz.tostring.external;

public class Toaster {
    private String brand;
    private int sliceCapacity;
    private String color;

    public Toaster(String brand, int sliceCapacity, String color) {
        this.brand = brand;
        this.sliceCapacity = sliceCapacity;
        this.color = color;
        System.out.println("Toaster class constructor running");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + "\nSlice Capacity: " + this.sliceCapacity + "\nColor: " + this.color;
    }
    @Override
    public int hashCode(){
        return 987654;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Toaster){
            Toaster toaster1=this;
            Toaster toaster2=(Toaster) obj;
            if(toaster1.brand==toaster2.brand && toaster1.sliceCapacity== toaster2.sliceCapacity && toaster1.color ==toaster2.color){
                return true;
            }
        }
        return false;
    }
}