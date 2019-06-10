package com.twu.biblioteca;

import com.twu.biblioteca.managers.BibliotecaManager;
import com.twu.biblioteca.managers.MovieListManager;
import com.twu.biblioteca.utils.Utils;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaApp {

    private static MovieListManager movieListManager;
    private static BibliotecaManager bibliotecaManager;
    private static final int EXIT_PROGRAM = 0;
    private static final int BOOKLIST_MENU = 1;
    private static final int RETURN_BOOK_MENU = 2;
    private static final int MOVIELIST_MENU = 3;
    private static List<String> MainMenu;

    private static void selectMenu(int option){
        switch (option) {
            case BOOKLIST_MENU:
                bibliotecaManager.menuBookList();
                break;
            case RETURN_BOOK_MENU:
                bibliotecaManager.menuReturnBook();
                break;
            case MOVIELIST_MENU:
                movieListManager.menuMovieList();
                break;
            default:
                System.out.print("Please select a valid option");
        }
    }

    public static void printHelloMessage() {
        System.out.println("Welcome to Biblioteca. Your one-stop-shop for great books titles in Bangalore");
    }

    public static void printMenu() {
        MainMenu = new ArrayList<>();
        MainMenu.add(BOOKLIST_MENU + " - List of Books");
        MainMenu.add(RETURN_BOOK_MENU + " - Return Book");
        MainMenu.add(MOVIELIST_MENU + " - List of Movies");
        MainMenu.add(EXIT_PROGRAM + " - Exit Program");

        for(String menuOption : MainMenu){
            System.out.println(menuOption);
        }

        System.out.println("\nSelect an option");
    }

    public static void main(String[] args) {
        int option;
        movieListManager = new MovieListManager();
        movieListManager.createMovieList();
        bibliotecaManager = new BibliotecaManager();
        bibliotecaManager.createBookList();

        printHelloMessage();

        do{
            printMenu();
            option = Utils.readFromKeyboard();

            selectMenu(option);

        }while (option !=  EXIT_PROGRAM);
    }
}
