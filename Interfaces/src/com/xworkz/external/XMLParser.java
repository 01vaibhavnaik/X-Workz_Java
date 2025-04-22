package com.xworkz.external;

import com.xworkz.internal.FileParser;

public class XMLParser {
    private FileParser fileParser;

    public XMLParser(FileParser fileParser) {
        this.fileParser = fileParser;
    }
    public void parseXML() {
        if(fileParser != null) {
            fileParser.parseFile();
        } else {
            System.out.println("No file parser provided");
        }
    }
}
