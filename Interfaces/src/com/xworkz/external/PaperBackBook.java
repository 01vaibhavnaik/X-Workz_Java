package com.xworkz.external;

import com.xworkz.internal.Book;

public class PaperBackBook {
    private Book book;

    public PaperBackBook(Book book) {
        this.book = book;
    }
    public void read() {
        if (book != null) {
            book.read();
        } else {
            System.out.println("Book is not set");
        }
    }
}
