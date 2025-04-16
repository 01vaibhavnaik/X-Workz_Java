package com.xwrokz.tostring.external;

public class Office {
    private String companyName;
    private int openTime;
    private int closeTime;

    public Office(String companyName, int openTime, int closeTime) {
        this.companyName = companyName;
        this.openTime = openTime;
        this.closeTime = closeTime;
        System.out.println("String ,Int, Int arg cont Running");
    }

    @Override
    public String toString() {
        return "Company Name:" + this.companyName + " \nOpen Time:" + this.openTime +"AM"+"\nClose Time:"+this.closeTime+"PM";
    }
    @Override
    public int hashCode(){
        return 2728;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Office){
            Office office1=this;
            Office office2=(Office) obj;
            if(office1.openTime== office2.openTime && office1.closeTime== office2.closeTime){
                return true;
            }
        }
        return false;
    }
}
