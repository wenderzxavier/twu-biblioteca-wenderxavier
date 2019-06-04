package com.twu.biblioteca;

import com.twu.biblioteca.managers.BibliotecaManager;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BookListTest {
    private ByteArrayOutputStream output;
    private PrintStream ps;
    private BookList bookList;

    @Before
    public void init(){
        bookList = new BookList();
        output = new ByteArrayOutputStream();
        ps = new PrintStream(output);

        Book book1 = new Book("TWU perdoa a gente", "author1, author2", 1990, "Comedy");
        Book book2 = new Book("TDD da depressão", "author1, author2", 1992, "Fictional");
        Book book3 = new Book("TDD da sofrencia", "author1, author2", 2000, "Drama");

        bookList.addBook(book1);
        bookList.addBook(book2);
        bookList.addBook(book3);

        System.setOut(ps);
    }

    @Test
    public void shouldReturnEmptyBookList(){
        int expected = 0;
        BookList emptyBookList = new BookList();

        assertEquals(expected, emptyBookList.getBookList().size());
    }

    @Test
    public void shouldAddABookInAList(){
        int expected = 4;

        Book book1 = new Book("Programming deExtreme", "author1, author2", 1990, "Comedy");

        bookList.addBook(book1);

        assertEquals(expected, bookList.getBookList().size());
    }

    @Test
    public void shouldAddABookWithId(){
        int expected = 4;

        Book book1 = new Book("Programming deExtreme", "author1, author2", 1990, "Comedy");

        bookList.addBook(book1);

        List<Book> myBooks = bookList.getBookList();

        assertEquals(expected, myBooks.get(myBooks.size() - 1).getId());
    }

    @Test
    public void shouldCheckoutBook(){
        boolean expected = false;
        int bookId = 2;

        Book returnedBook = bookList.checkoutBook(bookId);

        assertEquals(expected, returnedBook.isAvailable());
    }
}
