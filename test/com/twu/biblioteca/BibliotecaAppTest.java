package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BibliotecaAppTest {

    private ByteArrayOutputStream output;
    private PrintStream ps;
    private List<Book> bookList;


    @Before
    public void init(){
        bookList = new ArrayList<>();
        output = new ByteArrayOutputStream();
        ps = new PrintStream(output);

        Book book1 = new Book("TWU perdoa a gente", "author1, author2", 1990, "Comedy");
        Book book2 = new Book("TDD da depressão", "author1, author2", 1992, "Fictional");
        Book book3 = new Book("TDD da sofrencia", "author1, author2", 2000, "Drama");

        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);

        System.setOut(ps);
    }


    @Test
    public void shouldPrintParameterWelcomeMessage() {
        BibliotecaApp.printHelloMessage();
        assertEquals("Welcome to Biblioteca. Your one-stop-shop for great books titles in Bangalore", output.toString());
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
        assertFalse(bookList.isEmpty());
    }

    @Test
    public void shouldPrintABookList(){
        String expected = "";
        for (Book book : bookList){
            expected += book.toString();
        }

        BibliotecaApp.printBookList(bookList);

        assertEquals(expected, output.toString());
    }
}