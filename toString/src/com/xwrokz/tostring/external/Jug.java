package com.xwrokz.tostring.external;

public class Jug {
    private String color;
    private int capacity;
    private String material;
    
    
    public Jug(String color,int capacity,String material){
        this.color=color;
        this.capacity=capacity;
        this.material=material;
        System.out.println("String ,Int,String arg cont Running");
    }
    @Override
    public String toString(){
        return "Color:"+this.color+"\nCapacity:"+this.capacity+"\nMaterial:"+this.material;
    }
    @Override
    public int hashCode(){
        return 5;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Jug){
            Jug jug1=this;
            Jug jug2=(Jug) obj;
            if(jug1.capacity== jug2.capacity && jug1.color==jug2.color){
                return true;
            }
        }
        return false;
    }
    
}
