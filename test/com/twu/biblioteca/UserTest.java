package com.twu.biblioteca;

import com.twu.biblioteca.models.User;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class UserTest {

    private User user;
    private String libraryNumber;
    private String password;

    @Before
    public void init() {
        password = "123";
        libraryNumber = "231-1234";
        user = new User(libraryNumber, password);
    }

    @Test
    public void shouldCreateAnUser(){
        assertEquals(libraryNumber, user.getLibraryNumber());
    }

    @Test
    public void shouldUserHaveValidCredentials(){
        boolean expectedResult = true;
        assertEquals(expectedResult, user.checkCredentials(libraryNumber, password));
    }

    @Test
    public void shouldUserHaveAValidLibraryNumber(){
        boolean expectedResult = true;
        assertEquals(expectedResult, user.checkLibraryNumberPattern());
    }

    @Test
    public void shouldUserDoesntHaveAValidLibraryNumber(){
        boolean expectedResult = false;
        User user = new User("7476372", "sadsadas");
        assertEquals(expectedResult, user.checkLibraryNumberPattern());
    }
}
