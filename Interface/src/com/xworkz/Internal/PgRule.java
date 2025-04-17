package com.xworkz.Internal;

public interface PgRule {
    void book();
    void time();
    void keepClean();
    default void pay() {
        System.out.println("Paying the PG fee");
    }
}
