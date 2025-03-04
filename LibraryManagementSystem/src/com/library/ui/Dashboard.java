package com.library.ui;
import com.library.models.User;
import com.library.services.BookService;

import java.util.Scanner;


public class Dashboard {
    private BookService bookService;
    public Dashboard(BookService bookService) {
        this.bookService = bookService;
    }

    public void showMenu(User user) {
        Scanner scanner = new Scanner(System.in);
        int choice ;
        do {
            System.out.println("\n📚 Library Management System 📚");
            System.out.println("1. View Books");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. Logout");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> bookService.displayBooks();
                case 2 -> {
                    System.out.print("Enter Book ID to borrow: ");
                    int bookId = scanner.nextInt();
                    bookService.borrowBook(bookId, user);
                }
                case 3 -> {
                    System.out.print("Enter Book ID to return: ");
                    int bookId = scanner.nextInt();
                    bookService.returnBook(bookId, user);
                }
                case 4 -> System.out.println("Logging out...");
                default -> System.out.println("Invalid choice!");
            }
        } while (choice != 4);
    }
}
