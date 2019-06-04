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
                "1 - List of books\n" +
                "2 - Return Book" +
                "\n\n" +
                "Select an option: ";

        System.out.print(menu);
    }

    public void checkoutBook(int id) {
        if (bookList.isBookAvailable(id)) {
            Book book = bookList.checkoutBook(id);
            System.out.print("Thank you! Enjoy the book");
            return;
        }
        System.out.println("Sorry! The book is not available");
        menuBookList();
    }

    public void returnBook(int id){
        Book book = bookList.checkinBook(id);
    }

    public void handleMenuBookList() {
        int option;
        Scanner keyboard = new Scanner(System.in);

        option = keyboard.nextInt();

        switch (option) {
            case RETURN_MENU:
                return;
            default:
                checkoutBook(option);
                return;
        }
    }

    public void menuBookList() {
        for (Book book : bookList.getBookList()) {
            System.out.print(book);
        }
        System.out.print("\n\nType 0 to return, type the book number to checkout.\n");

        handleMenuBookList();
    }

    public void menuReturnBook(){
        System.out.println("\n\nType the BOOK CODE or 0 to return to main menu");

        int option;
        Scanner keyboard = new Scanner(System.in);

        option = keyboard.nextInt();

        switch (option) {
            case RETURN_MENU:
                return;
            default:
                returnBook(option);
                return;
        }

    }

    public BookList getBookListManager() {
        return bookList;
    }

}
