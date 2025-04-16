package com.xwrokz.tostring.external;

public class Bucket {

        private String brand;
        private int price;
        private char size;

        public Bucket(String brand,int price,char size){
            this.brand=brand;
            this.price=price;
            this.size=size;
            System.out.println("String ,Int, Char arg cont Running");
        }
        @Override
        public String toString(){
            return "Brand:"+this.brand+" \nPrice:"+this.price+"\nSize:"+this.size;
        }
    @Override
    public int hashCode(){
        return 6387;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Bucket){
            Bucket bucket1=this;
            Bucket bucket2=(Bucket) obj;
            if(bucket1.price==bucket2.price ){
                return true;
            }
        }
        return false;
    }


}
