package com.xworkz.external;

import com.xworkz.internal.Displayer;

public class NotificationPopup {
    private Displayer displayer;

    public NotificationPopup(Displayer displayer) {
        this.displayer = displayer;
    }

    public void showNotification() {
        if (displayer != null) {
            displayer.display();
        } else {
            System.out.println("No displayer provided.");
        }
    }
}
