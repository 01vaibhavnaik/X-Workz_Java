package com.xworkz.external;

import com.xworkz.internal.DatabaseConnection;

public class PostgreSQLConnection {
    private DatabaseConnection databaseConnection;

    public PostgreSQLConnection(DatabaseConnection databaseConnection) {
        this.databaseConnection = databaseConnection;
    }

    public void connect() {
        System.out.println("Connecting to PostgreSQL database");
        if (databaseConnection != null) {
            this.databaseConnection.connect();
        } else {
            System.err.println("Null");
        }
    }
}
