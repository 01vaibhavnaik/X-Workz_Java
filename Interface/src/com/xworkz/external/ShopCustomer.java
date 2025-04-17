package com.xworkz.external;

import com.xworkz.Internal.ShopRule;

public class ShopCustomer implements ShopRule {

    @Override
    public void openShop() {
        System.out.println("Open the shop");
    }

    @Override
    public void closeShop() {
        System.out.println("Close the shop");
    }

    @Override
    public void payBefore() {
        System.out.println("Pay before taking the product");
    }

    @Override
    public void shopTiming() {
        System.out.println("Shop timing is 10 AM to 8 PM");
    }


}
