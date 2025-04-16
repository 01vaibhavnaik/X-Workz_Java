package com.xwrokz.tostring.external;

public class TeddyBear {
    private String color;
    private boolean hasSound;
    private boolean isSoft;

    public TeddyBear(String color, boolean hasSound, boolean isSoft) {
        this.color = color;
        this.hasSound = hasSound;
        this.isSoft = isSoft;
        System.out.println("TeddyBear class constructor running");
    }

    @Override
    public String toString() {
        return "Color: " + this.color + "\nHas Sound: " + this.hasSound + "\nIs Soft: " + this.isSoft;
    }
    @Override
    public int hashCode(){
        return 574678;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof TeddyBear){
            TeddyBear teddyBear1=this;
            TeddyBear teddyBear2=(TeddyBear) obj;
            if(teddyBear1.color==teddyBear2.color && teddyBear1.hasSound== teddyBear2.hasSound && teddyBear1.isSoft ==teddyBear2.isSoft){
                return true;
            }
        }
        return false;
    }
}
