package com.xworkz.external;

import com.xworkz.internal.Printer;

public class LaserPrinter {
    private Printer printer;

    public LaserPrinter(Printer printer) {
        this.printer = printer;
    }
    public void print() {
        if(printer != null) {
            printer.printDocument();
        } else {
            System.out.println("Printer is not available");
        }
    }
}
