package com.xwrokz.tostring.external;

public class Watch {
    private String watchBrand;
    private int watchPrice;
    private String  watchColor;

    public Watch(String watchBrand,int watchPrice,String watchColor){
        this.watchBrand=watchBrand;
        this.watchPrice=watchPrice;
        this.watchColor=watchColor;
        System.out.println("String ,Int, String arg cont Running");
    }
    @Override
    public String toString(){
        return "Watch Brand:"+this.watchBrand+" \nWatch Price:"+this.watchPrice+"\nWatch Color:"+this.watchColor;
    }
    @Override
    public int hashCode(){
        return -3456765;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Watch){
            Watch watch1=this;
            Watch watch2=(Watch) obj;
            if(watch1.watchBrand==watch2.watchBrand && watch1.watchColor== watch2.watchColor && watch1.watchPrice ==watch2.watchPrice){
                return true;
            }
        }
        return false;
    }
}
