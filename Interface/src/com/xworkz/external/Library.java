package com.xworkz.external;

import com.xworkz.Internal.LibraryRule;

public class Library implements LibraryRule {

    @Override
    public void timeToOpenLibrary() {
        System.out.println("The library opens at 9 AM.");
    }

    @Override
    public void timeToCloseLibrary() {
        System.out.println("The library closes at 8 PM.");
    }

    @Override
    public void timeToReadBooks() {
        System.out.println("Reading books is allowed from 9 AM to 8 PM.");
    }
}
