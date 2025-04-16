package com.xwrokz.tostring.external;

public class IceCream {
    private String iceCreamFlavour;
    private int iceCreamPrice;
    private String  iceCreamLocation;

    public IceCream(String iceCreamFlavour,int iceCreamPrice,String iceCreamLocation){
        this.iceCreamFlavour=iceCreamFlavour;
        this.iceCreamPrice=iceCreamPrice;
        this.iceCreamLocation=iceCreamLocation;
        System.out.println("String ,int, String arg cont Running");
    }
    @Override
    public String toString(){
        return "IceCream Flavour:"+this.iceCreamFlavour+" \nIceCream Price:"+this.iceCreamPrice+"Rs"+"\nIceCream Shop Location:"+this.iceCreamLocation;
    }
    @Override
    public int hashCode(){
        return 8927;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof IceCream){
            IceCream iceCream1=this;
            IceCream iceCream2=(IceCream) obj;
            if(iceCream1.iceCreamFlavour== iceCream2.iceCreamFlavour && iceCream1.iceCreamPrice==iceCream2.iceCreamPrice){

                return true;
            }
        }
        return false;
    }
}
