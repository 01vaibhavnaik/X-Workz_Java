package com.xworkz.external;

import com.xworkz.internal.Connector;

public class ConnectorUser {

     private  Connector connector;

     public ConnectorUser (Connector connector){
         this.connector=connector;
         System.out.println("Parameterized Const");
    }
    public void display(){
         if(connector!=null){
             this.connector.run();
             this.connector.stop();
         }else {
             System.err.println("Null");
         }
    }
}
