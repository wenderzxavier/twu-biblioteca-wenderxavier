package com.twu.biblioteca.models;

public class Book {
    private int id;
    private String title;
    private String author;
    private int year;
    private String gender;
    private boolean available;

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

    public boolean isAvailable() {
        return available;
    }

    public void setAvailability(boolean available){
        this.available = available;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public Book(String title, String author, int year, String gender) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.gender = gender;
        this.available = true;
    }

    @Override
    public String toString() {
        String template = "\n %d - %s \n Author: %s , %s - %d";
        return String.format(template, id, title, author, gender, year);
    }
}
