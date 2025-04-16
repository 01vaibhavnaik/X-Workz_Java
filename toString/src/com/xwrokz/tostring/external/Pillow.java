package com.xwrokz.tostring.external;

public class Pillow {
    private String material;
    private String size;
    private String color;

    public Pillow(String material, String size, String color) {
        this.material = material;
        this.size = size;
        this.color = color;
        System.out.println("Pillow class constructor running");
    }

    @Override
    public String toString() {
        return "Material: " + this.material + "\nSize: " + this.size + "\nColor: " + this.color;
    }
    @Override
    public int hashCode(){
        return 2893;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Pillow){
            Pillow pillow1=this;
            Pillow pillow2=(Pillow) obj;
            if(pillow1.material== pillow2.material && pillow1.size== pillow2.size){
                return true;
            }
        }
        return false;
    }
}
