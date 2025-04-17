package com.xworkz.Internal;

public interface NetWorkRule {
    void timeToConnect();

    void timeToDisconnect();

    void timeToTransferData();

    default void noFakeNetwork() {
        System.out.println("No Fake Network");
    }

}
