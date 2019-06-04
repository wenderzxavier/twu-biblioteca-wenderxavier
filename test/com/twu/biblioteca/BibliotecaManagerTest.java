package com.twu.biblioteca;

import com.twu.biblioteca.managers.BibliotecaManager;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class BibliotecaManagerTest {
    private ByteArrayOutputStream output;
    private PrintStream ps;
    private BibliotecaManager bibliotecaManager;


    @Before
    public void init(){
        bibliotecaManager = new BibliotecaManager();
        output = new ByteArrayOutputStream();
        ps = new PrintStream(output);

        System.setOut(ps);
    }

    @Test
    public void shouldCreateBookListWithThreeBooks() {
        int expected = 3;
        bibliotecaManager.createBookList();

        assertEquals(expected, bibliotecaManager.getBookListManager().getBookList().size());
    }

    @Test
    public void shouldPrintParameterWelcomeMessage() {
        bibliotecaManager.printHelloMessage();
        assertEquals("Welcome to Biblioteca. Your one-stop-shop for great books titles in Bangalore", output.toString());
    }
}
