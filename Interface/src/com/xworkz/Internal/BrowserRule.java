package com.xworkz.Internal;

public interface BrowserRule {
    void noPopups();
    void noMalware();
    void noPhishing();

    default void noFakeWebsites() {
        System.out.println("No Fake Websites");
    }
}
