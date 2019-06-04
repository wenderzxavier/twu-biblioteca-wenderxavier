package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    @Test
    public void shouldCreateAnEmptyBook(){
        String expectedTitle = "bookTitle";
        String expectedAuthor = "bookAuthor";
        int expectedYear = 2019;
        String expectedGender = "bookGender";

        Book book = new Book(expectedTitle, expectedAuthor, expectedYear, expectedGender);

        assertEquals(expectedTitle, book.getTitle());
        assertEquals(expectedAuthor, book.getAuthor());
        assertEquals(expectedYear, book.getYear());
        assertEquals(expectedGender, book.getGender());
    }
}
