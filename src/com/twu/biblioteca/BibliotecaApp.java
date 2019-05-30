package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BibliotecaApp {

    public static List<Book> createBookList() {
        List<Book> bookList = new ArrayList<>();

        Book book1 = new Book("myBook1", "author1, author2", 1990, "Comedy");
        Book book2 = new Book("myBook2", "author1, author2", 1992, "Fictional");
        Book book3 = new Book("myBook3", "author1, author2", 2000, "Drama");

        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        return bookList;
    }

    public static void printHelloMessage() {
        System.out.print("Welcome to Biblioteca. Your one-stop-shop for great books titles in Bangalore");
    }

    public static void printBookList(List<Book> bookList) {
        for (Book book : bookList){
            System.out.print(book);
        }
    }

    public static void printMenu(){
        String menu = "\n" +
                "1 - List of books";

        System.out.print(menu);
    }

    public static void main(String[] args) {
        int option = -1;
        Scanner keyboard = new Scanner(System.in);
        List<Book> bookList = createBookList();


        printHelloMessage();

        do{
            printMenu();
            option = keyboard.nextInt();

            switch (option){
                case 1:
                    printBookList(bookList);
                    break;
            }


        }while (option > 0);
    }
}
