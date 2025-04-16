package com.xwrokz.tostring.external;

public class Laptop {
    private String laptopCompany;
    private float laptopPrice;
    private String  laptopColor;

    public Laptop(String laptopCompany,float laptopPrice,String laptopColor){
        this.laptopCompany=laptopCompany;
        this.laptopPrice=laptopPrice;
        this.laptopColor=laptopColor;
        System.out.println("String ,float, String arg cont Running");
    }
    @Override
    public String toString(){
        return "Laptop Company:"+this.laptopCompany+" \nLaptop Price:"+this.laptopPrice+"LKH"+"\nLaptop Color:"+this.laptopColor;
    }
    @Override
    public int hashCode(){
        return -1245;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Laptop){
            Laptop laptop1=this;
            Laptop laptop2=(Laptop) obj;
            if(laptop1.laptopCompany== laptop2.laptopCompany && laptop1.laptopColor==laptop2.laptopColor){
                return true;
            }
        }
        return false;
    }
}

