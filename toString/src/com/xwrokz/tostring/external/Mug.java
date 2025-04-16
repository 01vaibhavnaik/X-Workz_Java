package com.xwrokz.tostring.external;

public class Mug {
    private String material;
    private String color;
    private int capacity;

    public Mug(String material, String color, int capacity) {
        this.material = material;
        this.color = color;
        this.capacity = capacity;
        System.out.println("Mug class constructor running");
    }

    @Override
    public String toString() {
        return "Material: " + this.material + "\nColor: " + this.color + "\nCapacity: " + this.capacity;
    }
    @Override
    public int hashCode(){
        return 5872;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Mug){
            Mug mug1=this;
            Mug mug2=(Mug) obj;
            if(mug1.capacity== mug2.capacity && mug1.color== mug2.color){
                return true;
            }
        }
        return false;
    }
}
