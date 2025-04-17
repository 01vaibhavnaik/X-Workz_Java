package com.xworkz.external;

import com.xworkz.Internal.NetWorkRule;

public class Network implements NetWorkRule {

    @Override
    public void timeToConnect() {
        System.out.println("Time to connect.");
    }

    @Override
    public void timeToDisconnect() {
        System.out.println("Time to disconnect.");
    }

    @Override
    public void timeToTransferData() {
        System.out.println("Time to transfer data.");
    }
    @Override
    public void noFakeNetwork() {
        System.out.println("No fake network.");
    }
}
