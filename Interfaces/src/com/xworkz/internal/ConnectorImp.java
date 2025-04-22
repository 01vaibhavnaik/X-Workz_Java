package com.xworkz.internal;

public class ConnectorImp implements Connector{
    @Override
    public void run() {
        System.out.println("Running run in Connector Imp");
    }

    @Override
    public void stop() {
        System.out.println("Running stop in Connector Imp");
    }


}
