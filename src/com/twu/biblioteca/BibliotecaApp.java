package com.twu.biblioteca;

import com.twu.biblioteca.managers.BibliotecaManager;

import java.util.List;
import java.util.Scanner;

public class BibliotecaApp {

    private static BibliotecaManager bibliotecaManager;
    static final int EXIT_PROGRAM = 0;
    static final int BOOKLIST_MENU = 1;
    static final int RETURN_BOOK_MENU = 2;

    public static void selectMenu(int option){
        switch (option) {
            case BOOKLIST_MENU:
                bibliotecaManager.menuBookList();
                break;
            case RETURN_BOOK_MENU:
                bibliotecaManager.menuReturnBook();
                break;
            default:
                System.out.print("Please select a valid option");
        }
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int option;

        bibliotecaManager = new BibliotecaManager();
        bibliotecaManager.createBookList();
        bibliotecaManager.printHelloMessage();

        do{
            bibliotecaManager.printMenu();
            option = keyboard.nextInt();

            selectMenu(option);

        }while (option !=  EXIT_PROGRAM);
    }
}
