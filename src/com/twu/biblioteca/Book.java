package com.twu.biblioteca;

public class Book {
    private String title;
    private String author;
    private int year;
    private String gender;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public String getGender() {
        return gender;
    }

    public Book(String title, String author, int year, String gender) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.gender = gender;
    }

}
