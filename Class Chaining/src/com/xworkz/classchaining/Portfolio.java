package com.xworkz.classchaining;

public class Portfolio {
    Detail details;
    String gender;
    long phoneNo;

    Portfolio(Detail details,String gender,long phoneNo){
        this.details=details;
        this.gender=gender;
        this.phoneNo=phoneNo;
    }
    void portfolioDisplay(){
        System.out.println("Portfolio Details ");
        if(this.details!=null){
            details.detailsDisplay();
        }else System.err.println("Pointing to null");

        System.out.println("Gender "+this.gender);
        System.out.println("Phone no "+this.phoneNo);
    }
}
