package com.xworkz.classchaining;

public class Detail {
    int bithDate;
    String birthMonth;
    int birthYear;

    Detail(int birthDate,String birthMonth,int birthYear){
        this.bithDate=birthDate;
        this.birthMonth=birthMonth;
        this.birthYear=birthYear;
    }

    void detailsDisplay(){
        System.out.println("Details");
        System.out.println("Birth date "+this.bithDate );
        System.out.println("Birth month "+this.birthMonth);
        System.out.println("Birth year "+this.birthYear);
    }
}
