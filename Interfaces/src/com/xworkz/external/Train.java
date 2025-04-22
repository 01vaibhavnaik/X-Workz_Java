package com.xworkz.external;

import com.xworkz.internal.Transport;

public class Train {
    private Transport transport;

    public Train(Transport transport) {
        this.transport = transport;
    }
    public void start() {
        if(transport != null) {
            transport.startTransport();
        } else {
            System.out.println("Transport is not available");
        }
    }
}
