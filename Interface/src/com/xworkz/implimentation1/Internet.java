package com.xworkz.implimentation1;

import com.xworkz.Internal.BrowserRule;
import com.xworkz.Internal.NetWorkRule;

public class Internet implements NetWorkRule, BrowserRule {
    @Override
    public void noPopups() {
        System.out.println("No popups");
    }

    @Override
    public void noMalware() {
        System.out.println("No malware");
    }

    @Override
    public void noPhishing() {
        System.out.println("No phishing");
    }

    @Override
    public void timeToConnect() {
        System.out.println("Time to connect");
    }

    @Override
    public void timeToDisconnect() {
        System.out.println("Time to disconnect");
    }

    @Override
    public void timeToTransferData() {
        System.out.println("Time to transfer data");
    }
}
