package com.xwrokz.tostring.external;

public class Door {

    private String doorColor;
    private int doorPrice;
    private char doorSize;

    public Door(String doorColor,int doorPrice,char doorSize){
        this.doorColor=doorColor;
        this.doorPrice=doorPrice;
        this.doorSize=doorSize;
        System.out.println("String ,Int, Char arg cont Running");
    }
    @Override
    public String toString(){
        return "Brand:"+this.doorColor+" \nPrice:"+this.doorPrice+"\nSize:"+this.doorSize;
    }
    @Override
    public int hashCode(){
        return 86783;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Door){
            Door door1=this;
            Door door2=(Door) obj;
            if(door1.doorColor==door2.doorColor){
                return true;
            }
        }
        return false;
    }


}

