package com.xworkz.internal;

public class CreditCardPayment implements PaymentGateway {

    @Override
    public void processPayment() {
        System.out.println("Processing credit card payment");
    }


}
