package com.twu.biblioteca.managers;

import com.twu.biblioteca.Book;
import com.twu.biblioteca.BookList;
import com.twu.biblioteca.utils.Utils;

public class BibliotecaManager {

    private BookList bookList;
    private static final int RETURN_MENU = 0;

    public void createBookList() {
        bookList = new BookList();

        Book book1 = new Book("myBook1", "author1, author2", 1990, "Comedy");
        Book book2 = new Book("myBook2", "author1, author2", 1992, "Fictional");
        Book book3 = new Book("myBook3", "author1, author2", 2000, "Drama");

        bookList.addBook(book1);
        bookList.addBook(book2);
        bookList.addBook(book3);
    }

    private void checkoutBook(int id) {
        if (bookList.isBookAvailable(id)) {
            Book book = bookList.checkoutBook(id);
            System.out.print("Thank you! Enjoy the book");
            return;
        }
        System.out.println("Sorry! The book is not available");
        menuBookList();
    }

    private void returnBook(int id){
        if(bookList.isBookNotAvailable(id)){
            System.out.println("Thank you for returning book");
            return;
        }
        System.out.println("That is not a valid book to return");
        menuReturnBook();

    }

    private void handleMenuBookList() {
        int option = Utils.readFromKeyboard();

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

        int option = Utils.readFromKeyboard();

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
