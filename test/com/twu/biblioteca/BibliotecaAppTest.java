package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class BibliotecaAppTest {
    private ByteArrayOutputStream output;
    private PrintStream ps;

    @Before
    public void init(){
        output = new ByteArrayOutputStream();
        ps = new PrintStream(output);

        System.setOut(ps);
    }

    @Test
    public void shouldPrintParameterWelcomeMessage() {
        BibliotecaApp.printHelloMessage();
        assertEquals("Welcome to Biblioteca. Your one-stop-shop for great books titles in Bangalore\n", output.toString());
    }

}