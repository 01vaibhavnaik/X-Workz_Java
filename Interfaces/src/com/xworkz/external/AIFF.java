package com.xworkz.external;

import com.xworkz.internal.FIFA;

public class AIFF {
    private FIFA fifa;

    public AIFF(FIFA fifa) {
        this.fifa = fifa;
    }

    public void display() {
        System.out.println("AIFF is running");
        if (fifa != null) {
            this.fifa.fifaWorldCup();
        } else {
            System.err.println("Null");
        }
    }
}
