package com.xworkz.projector;

public class PortType {
    private String portType;
    private int portNo;

    PortType(String portType,int portNo){
    }

    void plugIn(){
        System.out.println("Running PortType");
        System.out.println("Port Type "+this.portType );
        System.out.println("Portno "+this.portNo);
    }
}
