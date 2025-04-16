package com.xworkz.task1.External;

import com.xworkz.task1.Internal.Laptop;

public class Build extends Laptop {
    public Build(String name, int price, String processor) {
        super(name, price, processor);
    }
    public Build(String name, int price) {
        super(name, price);
    }
    public Build(String name) {
        super(name);
    }
}

