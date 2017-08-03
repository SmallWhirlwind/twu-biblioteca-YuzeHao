package com.twu.biblioteca;

public class BookInfo {
    private String name;
    private String author;
    private String publish_date;

    public BookInfo() {
    }

    public BookInfo(String name, String author, String publish_date) {
        this.name = name;
        this.author = author;
        this.publish_date = publish_date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublish_date() {
        return publish_date;
    }

    public void setPublish_date(String publish_date) {
        this.publish_date = publish_date;
    }
}
