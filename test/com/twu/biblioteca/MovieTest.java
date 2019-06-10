package com.twu.biblioteca;

import com.twu.biblioteca.models.Movie;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MovieTest {

    @Test
    public void shouldCreateAnEmptyMovie(){
        String expectedName = "movieName";
        int expectedYear = 2019;
        String expectedDirector = "James Cameron";
        int expectedRating = 9;

        Movie myMovie = new Movie(expectedName, expectedYear, expectedDirector, expectedRating);

        assertEquals(expectedName, myMovie.getName());
        assertEquals(expectedYear, myMovie.getYear());
        assertEquals(expectedDirector, myMovie.getDirector());
        assertEquals(expectedRating, myMovie.getRating());
    }
}
