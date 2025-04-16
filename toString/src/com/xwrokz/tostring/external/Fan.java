package com.xwrokz.tostring.external;

public class Fan {
    private String fanBrand;
    private int fanPrice;
    private String  fanColor;

    public Fan(String fanBrand,int fanPrice,String fanColor){
        this.fanBrand=fanBrand;
        this.fanPrice=fanPrice;
        this.fanColor=fanColor;
        System.out.println("String ,Int, String arg cont Running");
    }
    @Override
    public String toString(){
        return "Fan Brand:"+this.fanBrand+" \nFan Price:"+this.fanPrice+"\nFan Color:"+this.fanColor;
    }
    @Override
    public int hashCode(){
        return 98763;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Fan){
            Fan fan1=this;
            Fan fan2=(Fan) obj;
            if(fan1.fanColor==fan2.fanColor){
                return true;
            }
        }
        return false;
    }
}
