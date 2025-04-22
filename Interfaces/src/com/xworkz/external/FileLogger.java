package com.xworkz.external;

import com.xworkz.internal.Logger;

public class FileLogger {
    private Logger logger;

    public FileLogger(Logger logger) {
        this.logger = logger;
    }

    public void log() {
        if (logger != null) {
            logger.logMessage();
        } else {
            System.err.println("Null");
        }
    }
}
