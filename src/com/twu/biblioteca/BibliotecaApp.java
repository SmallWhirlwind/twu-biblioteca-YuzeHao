package com.twu.biblioteca;

public class BibliotecaApp {

    private final static String WELCOME = "Welcome!";

    public static void main(String[] args) {
        System.out.println("Hello, world!");
        printMenu();
    }

    private static void printMenu() {
        String[] menu = {"List of books", "Exit"};
        System.out.println(WELCOME);
        for (int index = 0; index < menu.length; index++) {
            System.out.println(index + " - " + menu[index]);
        }
    }
}
