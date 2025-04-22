package com.xworkz.internal;

public class EmailService implements NotificationService {

    @Override
    public void sendNotification() {
        System.out.println("Sending email notification...");
    }

}
