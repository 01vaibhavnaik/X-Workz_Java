package com.xworkz.external;

import com.xworkz.Internal.BarberRule;

public class Barber implements BarberRule {

    @Override
    public void timeToOpenBarberShop() {
        System.out.println("Time to open barber shop is 9:00 AM");
    }

    @Override
    public void timeToCloseBarberShop() {
        System.out.println("Time to close barber shop is 8:00 PM");
    }

    @Override
    public void timeToCutHair() {
        System.out.println("Time to cut hair is 30 minutes");
    }
}
