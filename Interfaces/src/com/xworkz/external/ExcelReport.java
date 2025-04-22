package com.xworkz.external;

import com.xworkz.internal.ReportGenerator;

public class ExcelReport {
    private ReportGenerator reportGenerator;

    public ExcelReport(ReportGenerator reportGenerator) {
        this.reportGenerator = reportGenerator;
    }
    public void generate() {
        if (reportGenerator != null) {
            reportGenerator.generateReport();
        } else {
            System.err.println("Null");
        }
    }
}
