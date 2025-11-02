package homework.library;

import employee.Storage.BookStorage;

import java.util.Scanner;

public interface Commands {

    Scanner scanner = new Scanner(System.in);
    BookStorage bookStorage = new BookStorage();
    String EXIT = "0";
    String ADD_AUTHOR = "1";
    String ADD_BOOK = "2";
    String PRINT_ALL_AUTHORS = "3";
    String PRINT_ALL_BOOKS = "4";
    String SEARCH_BOOK_BY_TITLE = "5";
    String SEARCH_BOOK_BY_AUTHORS = "6";
    String PRINT_EXPENSIVE_BOOK = "7";
    String IN_PROVIDED_INTERVAL = "8";
    String DELETE_BY_INDEX = "9";

    static void printCommands() {
        System.out.println("Please input " + EXIT + " for EXIT");
        System.out.println("Please input " + ADD_AUTHOR + " for ADD_AUTHOR");
        System.out.println("Please input " + ADD_BOOK + " for ADD BOOK");
        System.out.println("Please input " + PRINT_ALL_AUTHORS + " for PRINT_ALL_AUTHORS");
        System.out.println("Please input " + PRINT_ALL_BOOKS + " for PRINT_ALL_BOOKS");
        System.out.println("Please input " + SEARCH_BOOK_BY_TITLE + " for SEARCH_BOOK_BY_TITLE ");
        System.out.println("Please input " + SEARCH_BOOK_BY_AUTHORS + " for SEARCH_BOOK_BY_AUTHORS");
        System.out.println("Please input " + PRINT_EXPENSIVE_BOOK + " for PRINT_EXPENSIVE_BOOK");
        System.out.println("Please input " + IN_PROVIDED_INTERVAL + " for IN_PROVIDED_INTERVAL");
        System.out.println("Please input " + DELETE_BY_INDEX + " for DELETE BY INDEX ");
    }

}