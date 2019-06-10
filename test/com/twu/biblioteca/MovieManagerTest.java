package com.twu.biblioteca;

import com.twu.biblioteca.managers.MovieListManager;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertEquals;

public class MovieManagerTest {
    private ByteArrayOutputStream output;
    private PrintStream ps;
    private MovieListManager movieListManager;

    @Before
    public void init(){
        movieListManager = new MovieListManager();
        output = new ByteArrayOutputStream();
        ps = new PrintStream(output);

        System.setOut(ps);
    }

    @Test
    public void shouldCreateMovieListWithThreeMovies() {
        int expected = 3;
        movieListManager.createMovieList();

        assertEquals(expected, movieListManager.getMovieListManager().getMovieList().size());
    }

}
