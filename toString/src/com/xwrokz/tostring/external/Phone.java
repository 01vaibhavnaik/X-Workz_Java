package com.xwrokz.tostring.external;

public class Phone {
    private String phoneCompany;
    private float phonePrice;
    private String  phoneColor;

    public Phone(String phoneCompany,float phonePrice,String phoneColor){
        this.phoneCompany=phoneCompany;
        this.phonePrice=phonePrice;
        this.phoneColor=phoneColor;
        System.out.println("String ,float, String arg cont Running");
    }
    @Override
    public String toString(){
        return "Phone Company:"+this.phoneCompany+" \nPhone Price:"+this.phonePrice+"LKH"+"\nPhone Color:"+this.phoneColor;
    }
    @Override
    public int hashCode(){
        return 8628;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Penguin){
            Phone phone1=this;
            Phone phone2=(Phone) obj;
            if(phone1.phoneCompany== phone2.phoneCompany && phone1.phonePrice== phone2.phonePrice){
                return true;
            }
        }
        return false;
    }
}
