package com.twu.biblioteca;

import com.twu.biblioteca.models.Movie;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MovieListTest {
    private ByteArrayOutputStream output;
    private PrintStream ps;
    private MovieList movieList;

    @Before
    public void init(){
        movieList = new MovieList();
        output = new ByteArrayOutputStream();
        ps = new PrintStream(output);

        Movie movie = new Movie("Avatar", 2008, "James Cameron", 10);

        movieList.addMovie(movie);

        System.setOut(ps);
    }

    @Test
    public void shouldReturnEmptyMovieList(){
        int expected = 0;
        MovieList emptyMovieList = new MovieList();

        assertEquals(expected, emptyMovieList.getMovieList().size());
    }

    @Test
    public void shouldAddAMovieInAList(){
        int expected = 2;

        Movie movie = new Movie("Avatar", 2008, "James Cameron", 10);

        movieList.addMovie(movie);

        assertEquals(expected, movieList.getMovieList().size());
    }

    @Test
    public void shouldAddAMovieWithId(){
        int expected = 2;

        Movie movie = new Movie("Avatar", 2008, "James Cameron", 10);

        movieList.addMovie(movie);

        List<Movie> myMovies = movieList.getMovieList();

        assertEquals(expected, myMovies.get(myMovies.size() - 1).getId());
    }

    @Test
    public void shouldMovieIsAvailable() {
        boolean expected = true;
        boolean received = movieList.isMovieAvailable(1);

        assertEquals(expected, received);
    }

    @Test
    public void shouldMovieIsNotAvailable() {
        boolean expected = false;
        boolean received = movieList.isMovieNotAvailable(1);

        assertEquals(expected, received);
    }


}
