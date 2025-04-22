package com.xworkz.external;

import com.xworkz.internal.DataExporter;

public class XMLExporter {
    private DataExporter dataExporter;

    public XMLExporter(DataExporter dataExporter) {
        this.dataExporter = dataExporter;
    }
    public void export() {
        if (dataExporter != null) {
            dataExporter.exportData();
        } else {
            System.err.println("Null");
        }
    }
}
