package com.xworkz.external;

import com.xworkz.internal.Laptop;

public class OperatingSys {
    private Laptop laptop;

    public OperatingSys(Laptop laptop) {
        this.laptop = laptop;
    }
    public void display() {
        System.out.println("show is running in OperatingSys");
        if (laptop != null) {
            this.laptop.processor();
        } else {
            System.err.println("Null");
        }
    }
}
