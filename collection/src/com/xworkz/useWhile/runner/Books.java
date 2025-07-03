package com.xworkz.useWhile.runner;

import com.xworkz.useWhile.dto.BookDTO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Books {
    public static void main(String[] args) {
        Collection<BookDTO> books= new ArrayList<BookDTO>();
        books.add(new BookDTO("The Alchemist", 300, "Paulo Coelho", "HarperCollins", 1988, "English", 208, "Amazon"));
        books.add(new BookDTO("To Kill a Mockingbird", 400, "Harper Lee", "J.B. Lippincott & Co.", 1960, "English", 281, "Barnes & Noble"));
        books.add(new BookDTO("1984", 350, "George Orwell", "Secker & Warburg", 1949, "English", 328, "Book Depository"));
        books.add(new BookDTO("Pride and Prejudice", 250, "Jane Austen", "T. Egerton", 1813, "English", 279, "Books-A-Million"));
        books.add(new BookDTO("The Great Gatsby", 300, "F. Scott Fitzgerald", "Charles Scribner's Sons", 1925, "English", 180, "IndieBound"));
        books.add(new BookDTO("Moby", 450, "Herman Melville", "Harper & Brothers", 1851, "English", 635, "Bookshop.org"));
        books.add(new BookDTO("War and Peace", 600, "Leo Tolstoy", "The Russian Messenger", 1869, "English", 1225, "ThriftBooks"));
        books.add(new BookDTO("The Catcher in the Rye", 280, "J.D. Salinger", "Little, Brown and Company", 1951, "English", 277, "Book Outlet"));
        books.add(new BookDTO("Brave New World", 320, "Aldous Huxley", "Chatto & Windus", 1932, "English", 311, "Books-A-Million"));
        books.add(new BookDTO("The Hobbit", 280, "J.R.R. Tolkien", "George Allen & Unwin", 1937, "English", 310, "Book Depository"));

        Iterator<BookDTO> iterator= books.iterator();
        while (iterator.hasNext()){
            BookDTO booksDetail = iterator.next();
            System.out.println(""+booksDetail);



        }


    }
}
