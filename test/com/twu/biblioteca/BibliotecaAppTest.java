package com.twu.biblioteca;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

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
}