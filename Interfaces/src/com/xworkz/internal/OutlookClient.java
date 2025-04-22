package com.xworkz.internal;

public class OutlookClient implements EmailClient {

    @Override
    public void sendEmail() {
        System.out.println("Sending email using Outlook client");
    }

}
