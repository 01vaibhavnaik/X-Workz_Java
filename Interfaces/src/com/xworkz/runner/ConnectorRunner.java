package com.xworkz.runner;

import com.xworkz.external.ConnectorUser;
import com.xworkz.internal.Connector;
import com.xworkz.internal.ConnectorImp;

public class ConnectorRunner {
    public static void main(String[] args) {
        Connector connector=new ConnectorImp();
        ConnectorUser connectorUser=new ConnectorUser(connector);
        connectorUser.display();
    }
}
