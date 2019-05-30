package com.twu.biblioteca;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BibliotecaAppTest {

    @Test
    public void shouldPrintParameterWelcomeMessage() {
        ByteArrayOutputStream expectedMessage = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(expectedMessage);
        System.setOut(ps);

        BibliotecaApp.printHelloMessage();

        assertEquals("Welcome to Biblioteca. Your one-stop-shop for great books titles in Bangalore", expectedMessage.toString());
    }

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

    @Test
    public void shouldCreateNonEmptyBookList() {
        List<Book> booklist = BibliotecaApp.createBookList();

        assertFalse(booklist.isEmpty());
    }
}