package com.xworkz.external;

import com.xworkz.Internal.PgRule;

public class People implements PgRule {

    @Override
    public void book() {
        System.out.println("Booking the PG");
    }

    @Override
    public void time() {
        System.out.println("Time to wake up");
    }

    @Override
    public void keepClean() {
        System.out.println("Keep the PG clean");
    }

    @Override
    public void pay() {
        System.out.println("Paying the PG fee");
    }

}
