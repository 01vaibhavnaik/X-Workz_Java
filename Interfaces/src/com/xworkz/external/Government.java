package com.xworkz.external;

import com.xworkz.internal.Constitution;

public class Government {
    private Constitution constitution;

    public Government(Constitution constitution) {
        this.constitution = constitution;
    }
    public void display() {
        System.out.println("show is running in Government");
        if (constitution != null) {
            this.constitution.folloLaws();
        } else {
            System.err.println("Null");
        }
    }
}
