package com.twu.biblioteca.models;

import java.util.regex.Pattern;

public class User {

    private String libraryNumber;
    private String password;

    public User(String libraryNumber, String password) {
        this.libraryNumber = libraryNumber;
        this.password = password;
    }

    public String getLibraryNumber() {
        return libraryNumber;
    }

    public boolean checkCredentials(String libraryNumber, String password){
        return (libraryNumber.equals(this.libraryNumber) && password.equals(this.password));
    }

    public boolean checkLibraryNumberPattern(){
        String regex = "\\d{3}-\\d{4}";
        return Pattern.matches(regex, this.libraryNumber);
    }
}
