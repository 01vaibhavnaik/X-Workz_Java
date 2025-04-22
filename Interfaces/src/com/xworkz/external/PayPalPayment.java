package com.xworkz.external;

import com.xworkz.internal.PaymentGateway;

public class PayPalPayment {
    private PaymentGateway paymentGateway;

    public PayPalPayment(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }
    public void display() {
        System.out.println("PayPalPayment is running");
        if (paymentGateway != null) {
            this.paymentGateway.processPayment();
        } else {
            System.err.println("Null");
        }
    }
}
