package com.xworkz.useWhile.dto;

public class BookDTO {
    private String name;
    private int price;
    private String authorName;
    private String publisherName;
    private int publishedYear;
    private String language;
    private int pages;
    private String availableAt;


    public BookDTO(String name, int price, String authorName, String publisherName, int publishedYear, String language, int pages, String availableAt) {
        this.name = name;
        this.price = price;
        this.authorName = authorName;
        this.publisherName = publisherName;
        this.publishedYear = publishedYear;
        this.language = language;
        this.pages = pages;
        this.availableAt = availableAt;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public String getLanguage() {
        return language;
    }

    public int getPages() {
        return pages;
    }

    public String getAvailableAt() {
        return availableAt;
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", authorName='" + authorName + '\'' +
                ", publisherName='" + publisherName + '\'' +
                ", publishedYear=" + publishedYear +
                ", language='" + language + '\'' +
                ", pages=" + pages +
                ", availableAt='" + availableAt + '\'' +
                '}';
    }
}
