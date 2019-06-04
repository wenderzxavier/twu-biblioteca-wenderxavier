package com.twu.biblioteca;

import com.twu.biblioteca.managers.BibliotecaManager;

import java.util.List;
import java.util.Scanner;

public class BibliotecaApp {

    static private BibliotecaManager bibliotecaManager;
    static private BookList bookList;

    public static BookList createBookList() {
        bookList = new BookList();

        Book book1 = new Book("myBook1", "author1, author2", 1990, "Comedy");
        Book book2 = new Book("myBook2", "author1, author2", 1992, "Fictional");
        Book book3 = new Book("myBook3", "author1, author2", 2000, "Drama");

        bookList.addBook(book1);
        bookList.addBook(book2);
        bookList.addBook(book3);

        return bookList;
    }


    public static void menuBookList() {
        int option = -1;
        Scanner keyboard = new Scanner(System.in);

        do{

            for (Book book : bookList.getBookList()){
                System.out.print(book);
            }
            System.out.print("\n\nDigite 0 para voltar, ou o numero do livro para reservar ");

            option = keyboard.nextInt();

            Book book = bookList.checkoutBook(option);

            System.out.print(book);

            option = 0;

        }while(option > 0);

    }

    public static void printMenu(){
        String menu = "\n\n" +
                "1 - List of books" +
                "\n\n" +
                "Selecione uma opção: ";

        System.out.print(menu);
    }

    public static void selectMenu(int option){
        switch (option) {
            case 1:
                menuBookList();
                break;
            default:
                System.out.print("Please select a valid option");
        }

    }

    public static void main(String[] args) {
        bibliotecaManager = new BibliotecaManager();


        int option = -1;
        bookList = createBookList();
        Scanner keyboard = new Scanner(System.in);

        bibliotecaManager.printHelloMessage();

        do{
            printMenu();
            option = keyboard.nextInt();

            selectMenu(option);

        }while (option > 0);
    }
}
