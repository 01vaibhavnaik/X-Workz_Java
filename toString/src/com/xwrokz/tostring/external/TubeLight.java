package com.xwrokz.tostring.external;

public class TubeLight {
    private String tubeLightBrand;
    private int tubeLightPrice;
    private String  tubeLightColor;

    public TubeLight(String tubeLightBrand,int tubeLightPrice,String tubeLightColor){
        this.tubeLightBrand=tubeLightBrand;
        this.tubeLightPrice=tubeLightPrice;
        this.tubeLightColor=tubeLightColor;
        System.out.println("String ,Int, String arg cont Running");
    }
    @Override
    public String toString(){
        return "TubeLight Brand:"+this.tubeLightBrand+" \nTubeLight Price:"+this.tubeLightPrice+"\nTubeLight Color:"+this.tubeLightColor;
    }
    @Override
    public int hashCode(){
        return 34678;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof TubeLight){
            TubeLight tubeLight1=this;
            TubeLight tubeLight2=(TubeLight) obj;
            if(tubeLight1.tubeLightBrand==tubeLight2.tubeLightBrand && tubeLight1.tubeLightPrice== tubeLight2.tubeLightPrice && tubeLight1.tubeLightColor ==tubeLight2.tubeLightColor){
                return true;
            }
        }
        return false;
    }
}
