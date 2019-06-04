package com.twu.biblioteca.managers;

import com.twu.biblioteca.Book;
import com.twu.biblioteca.BookList;

import java.util.Scanner;

public class BibliotecaManager {

    private BookList bookList;
    static final int RETURN_MENU = 0;

    public void createBookList() {
        bookList = new BookList();

        Book book1 = new Book("myBook1", "author1, author2", 1990, "Comedy");
        Book book2 = new Book("myBook2", "author1, author2", 1992, "Fictional");
        Book book3 = new Book("myBook3", "author1, author2", 2000, "Drama");

        bookList.addBook(book1);
        bookList.addBook(book2);
        bookList.addBook(book3);
    }

    public void printHelloMessage() {
        System.out.print("Welcome to Biblioteca. Your one-stop-shop for great books titles in Bangalore");
    }

    public void printMenu() {
        String menu = "\n\n" +
                "1 - List of books" +
                "\n\n" +
                "Select an option: ";

        System.out.print(menu);
    }

    public void handleMenu(){
        int option;
        Scanner keyboard = new Scanner(System.in);

        option = keyboard.nextInt();

        switch (option){
            case RETURN_MENU:
                return;
            default:
                System.out.println("Invalid option. Try again.");
                menuBookList();
                return;
        }
    }

    public void menuBookList() {
        for (Book book : bookList.getBookList()) {
            System.out.print(book);
        }
        System.out.print("\n\nType 0 to return, type the book number to checkout ");

        handleMenu();
//        Book book = bookList.checkoutBook(option);
//        System.out.print(book);
    }

    public BookList getBookListManager() {
        return bookList;
    }

}
