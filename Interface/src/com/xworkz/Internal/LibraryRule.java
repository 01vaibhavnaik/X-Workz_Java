package com.xworkz.Internal;

public interface LibraryRule {
    void timeToOpenLibrary();

    void timeToCloseLibrary();

    void timeToReadBooks();

    default void noFakeLibrary() {
        System.out.println("No Fake Library");
    }


}
