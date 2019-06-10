package com.twu.biblioteca.managers;

import com.twu.biblioteca.MovieList;
import com.twu.biblioteca.models.Movie;
import com.twu.biblioteca.utils.Utils;

public class MovieListManager {
    private MovieList movieList;
    private static final int RETURN_MENU = 0;

    public void createMovieList() {
        movieList = new MovieList();

        Movie movie1 = new Movie("Avengers: Inifinity War", 2017, "Russos Brothers", 10);
        Movie movie2 = new Movie("Inception", 2010, "Christopher Nolan", 10);
        Movie movie3 = new Movie("Black Swan", 2010, "Darren", 8);

        movieList.addMovie(movie1);
        movieList.addMovie(movie2);
        movieList.addMovie(movie3);
    }

        private void handleMenuMovieList() {
        int option = Utils.readFromKeyboard();

        switch (option) {
            case RETURN_MENU:
                return;
            default:
//                checkoutMovie(option);
                return;
        }
    }

    public void menuMovieList() {
        for (Movie movie : movieList.getMovieList()) {
            System.out.print(movie);
        }
        System.out.print("\n\nType 0 to return, type the movie number to checkout.\n");

        handleMenuMovieList();
    }

    public MovieList getMovieListManager() {
        return movieList;
    }
}
