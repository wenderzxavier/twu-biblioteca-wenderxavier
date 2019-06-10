package com.twu.biblioteca.models;

public class Movie {
    private int id;
    private String name;
    private String director;
    private int year;
    private int rating;
    private boolean available;

    public Movie(String name, int year, String director, int rating) {
        this.name = name;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.available = true;
    }

    public Movie(String name, int year, String director) {
        this.name = name;
        this.director = director;
        this.year = year;
        this.rating = 0;
        this.available = true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getDirector() {
        return director;
    }

    public int getYear() {
        return year;
    }

    public int getRating() {
        return rating;
    }

    public boolean isAvailable() {
        return available;
    }

    @Override
    public String toString() {
        String template = "\n %d - %s (Director: %s, %d | Rating: %d)";
        return String.format(template, id, name, director, year, rating);
    }
}
