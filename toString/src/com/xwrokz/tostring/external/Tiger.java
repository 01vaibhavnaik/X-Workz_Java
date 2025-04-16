package com.xwrokz.tostring.external;

public class Tiger {
    private String habitat;
    private int weight;
    private String stripePattern;

    public Tiger(String habitat, int weight, String stripePattern) {
        this.habitat = habitat;
        this.weight = weight;
        this.stripePattern = stripePattern;
        System.out.println("Tiger class constructor running");
    }

    @Override
    public String toString() {
        return "Habitat: " + this.habitat + "\nWeight: " + this.weight + " kg\nStripe Pattern: " + this.stripePattern;
    }
    @Override
    public int hashCode(){
        return 434567;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Tiger){
            Tiger tiger1=this;
            Tiger tiger2=(Tiger) obj;
            if(tiger1.habitat==tiger2.habitat && tiger1.weight== tiger2.weight && tiger1.stripePattern ==tiger2.stripePattern){
                return true;
            }
        }
        return false;
    }
}