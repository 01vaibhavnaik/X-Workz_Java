package com.xworkz.classchaining;

public class Security {
    int securityCode;
    Personal personal;



    //Personal[] personal={personalc1,personalc2};
    public Security(int securityCode,Personal personal){
        this.securityCode=securityCode;
        this.personal=personal;

    }

    public void securityDisplay(){
        System.out.println("Security Code"+this.securityCode);

        if(this.personal!=null){
            this.personal.personalDisplay();
        }else System.err.println("Pointing to null");

    }
}
