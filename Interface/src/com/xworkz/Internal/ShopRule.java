package com.xworkz.Internal;

public interface ShopRule {
    void openShop();
    void closeShop();
    void payBefore();

    default void shopTiming() {
        System.out.println("Shop timing is 9 AM to 9 PM");
    }

}
