package com.xwrokz.tostring.external;

public class EarRings {
    private String type;
    private int earRingPrice;
    private String earRingColor;

    public EarRings(String type, int earRingPrice, String earRingColor) {
        this.type = type;
        this.earRingPrice = earRingPrice;
        this.earRingColor = earRingColor;
        System.out.println("String ,Int, Char arg cont Running");
    }

    @Override
    public String toString() {
        return "Type:" + this.type + " \nEarRingPrice:" + this.earRingPrice + "\nEarRingColor:" + this.earRingColor;
    }
    @Override
    public int hashCode(){
        return 539;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof EarRings){
            EarRings earRings1=this;
            EarRings earRings2=(EarRings) obj;
            if(earRings1.earRingPrice==earRings2.earRingPrice){
                return true;
            }
        }
        return false;
    }
}
