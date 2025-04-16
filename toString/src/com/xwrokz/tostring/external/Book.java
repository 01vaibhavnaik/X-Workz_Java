package com.xwrokz.tostring.external;

public class Book {
    private String title;
    private String author;
    private int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        System.out.println("Book class constructor running");
    }

    @Override
    public String toString() {
        return "Title: " + this.title + "\nAuthor: " + this.author + "\nPages: " + this.pages;
    }
    @Override
    public int hashCode(){
        return 432;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Book){
            Book book1=this;
            Book book2=(Book) obj;
            if(book1.title==book2.title ){
                return true;
            }
        }
        return false;
    }
}
