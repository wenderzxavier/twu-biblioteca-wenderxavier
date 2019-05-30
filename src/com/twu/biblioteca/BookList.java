package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class BookList {

    private List<Book> bookList;

    public BookList(){
        bookList = new ArrayList<>();
    }

    public List<Book> getBookList() {
        List<Book> availableBooks = new ArrayList<>();
        for(Book book : bookList){
            if(book.isAvailable()) availableBooks.add(book);
        }
        return availableBooks;
    }

    public void addBook(Book book){
        book.setId(bookList.size() + 1);
        bookList.add(book);
    }

    public Book checkoutBook(int id){
        Book book = bookList.get(id - 1);
        book.setAvailability(false);
        return book;
    }
}
