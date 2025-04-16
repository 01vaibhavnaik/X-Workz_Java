package com.xwrokz.tostring.external;
public class SkateBoard {
    private String brand;
    private String material;
    private int size;

    public SkateBoard(String brand, String material, int size) {
        this.brand = brand;
        this.material = material;
        this.size = size;
        System.out.println("Skateboard class constructor running");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + "\nMaterial: " + this.material + "\nSize: " + this.size;
    }
    @Override
    public int hashCode(){
        return 2854660;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof SkateBoard){
            SkateBoard skateBoard1=this;
            SkateBoard skateBoard2=(SkateBoard) obj;
            if(skateBoard1.brand== skateBoard2.brand && skateBoard1.material== skateBoard2.material && skateBoard1.size ==skateBoard2.size){
                return true;
            }
        }
        return false;
    }
}
