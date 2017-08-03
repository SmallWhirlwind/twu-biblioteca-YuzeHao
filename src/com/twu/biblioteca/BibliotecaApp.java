package com.twu.biblioteca;

import java.util.*;
import com.twu.biblioteca.BookInfo;

public class BibliotecaApp {

    private final static String WELCOME = "Welcome!";

    private final static BookInfo[] BOOK_LIST = {new BookInfo("Java", "Tom", "2010"),
            new BookInfo("OC", "Tom", "2010"),
            new BookInfo("Swift", "Tom", "2010"),
            new BookInfo("C", "Tom", "2010"),
            new BookInfo("C++", "Tom", "2010"),
            new BookInfo("Python", "Tom", "2010")};

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Hello, world!");
        printAdminOrUser();
        System.out.println("Enter a number: ");
        int index = reader.nextInt();
        if(index==0) {
            
            printMenu();
        }
        else {

        }
    }

    private static void printMenu() {
        String[] menu = {"List of books", "Exit"};
        System.out.println(WELCOME);
        for (int index = 0; index < menu.length; index++) {
            System.out.println(index + " - " + menu[index]);
        }
    }

    private static void printBookList() {
        for (BookInfo book : BOOK_LIST) {
            System.out.println(book.getName()+"---"+book.getAuthor()+"---"+book.getPublish_date());
        }
    }

    private static void printAdminOrUser() {
        String[] menu = {"Admin", "User"};
        System.out.println(WELCOME);
        for (int index = 0; index < menu.length; index++) {
            System.out.println(index + " - " + menu[index]);
        }
    }
}
