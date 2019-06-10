package com.twu.biblioteca;

import com.twu.biblioteca.models.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieList {

    private List<Movie> movieList;

    public MovieList(){
        movieList = new ArrayList<>();
    }

    public List<Movie> getMovieList() {
        List<Movie> availableMovies = new ArrayList<>();
        for(Movie movie : movieList){
            if(movie.isAvailable()) availableMovies.add(movie);
        }
        return availableMovies;
    }

    public void addMovie(Movie movie){
        movie.setId(movieList.size() + 1);
        movieList.add(movie);
    }

    public boolean isMovieNotAvailable(int id){
        return( id <= movieList.size() && !movieList.get(id -1).isAvailable());
    }

    public boolean isMovieAvailable(int id){
        return( id <= movieList.size() && movieList.get(id -1).isAvailable());
    }

    public Movie checkoutMovie(int id){
        Movie movie = movieList.get(id - 1);
        movie.setAvailability(false);
        return movie;
    }

}
