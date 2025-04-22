package com.xworkz.external;

import com.xworkz.internal.ICC;

public class BCCI {

    private ICC icc;



    public BCCI(ICC icc) {
        this.icc = icc;
    }


    public void display() {
        System.out.println("show is running in BCCI");
        if(icc != null) {
            this.icc.fairPlay();
        } else {
            System.err.println("Null");
        }
    }



}
