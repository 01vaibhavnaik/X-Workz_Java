package com.xwrokz.tostring.external;

public class PowerBank {
    private String powerBankCompany;
    private int powerBankPrice;
    private String  powerBankColor;

    public PowerBank(String powerBankCompany,int powerBankPrice,String powerBankColor){
        this.powerBankCompany=powerBankCompany;
        this.powerBankPrice=powerBankPrice;
        this.powerBankColor=powerBankColor;
        System.out.println("String ,int, String arg cont Running");
    }
    @Override
    public String toString(){
        return "Power Bank Company:"+this.powerBankCompany+" \nPower Bank Price:"+this.powerBankPrice+"Rs"+"\nPower Bank Color:"+this.powerBankColor;
    }
    @Override
    public int hashCode(){
        return -3882;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof PowerBank){
            PowerBank powerBank1=this;
            PowerBank powerBank2=(PowerBank) obj;
            if(powerBank1.powerBankCompany== powerBank1.powerBankCompany && powerBank1.powerBankPrice== powerBank2.powerBankPrice){
                return true;
            }
        }
        return false;
    }
}
