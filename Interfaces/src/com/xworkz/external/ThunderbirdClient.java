package com.xworkz.external;

import com.xworkz.internal.EmailClient;

public class ThunderbirdClient {
    private EmailClient emailClient;

    public ThunderbirdClient(EmailClient emailClient) {
        this.emailClient = emailClient;
    }
    public void sendEmail() {
        if(emailClient != null) {
            emailClient.sendEmail();
        } else {
            System.out.println("No email client provided");
        }
    }
}
