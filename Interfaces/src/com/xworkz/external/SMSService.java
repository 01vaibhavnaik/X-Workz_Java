package com.xworkz.external;

import com.xworkz.internal.NotificationService;

public class SMSService {
    private NotificationService notificationService;

    public SMSService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
    public void sendSMS() {
        System.out.println("Sending SMS");
        if (notificationService != null) {
            this.notificationService.sendNotification();
        } else {
            System.err.println("Null");
        }
    }


}
