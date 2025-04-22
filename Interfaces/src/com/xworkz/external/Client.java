package com.xworkz.external;

import com.xworkz.internal.Filter;

public class Client {
    private Filter filter;

    public Client(Filter filter) {
        this.filter = filter;
    }

    public void processEmail() {
        if(filter != null) {
            filter.filter();
        } else {
            System.out.println("No filter provided.");
        }
    }
}
