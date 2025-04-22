package com.xworkz.external;

import com.xworkz.internal.Document;

public class TextDocument {
    private Document document;

    public TextDocument(Document document) {
        this.document = document;
    }
    public void open() {
        if (document != null) {
            document.openDocument();
        } else {
            System.out.println("No document to open");
        }
    }
}
