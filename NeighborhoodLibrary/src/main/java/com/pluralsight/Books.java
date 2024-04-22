package com.pluralsight;
import java.util.Scanner;

public class Books {
    public static void main(String[] args) {
        // Create an array to store book objects
        Book[] books = new Book[20];
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        // Initialize book objects
        Book book1 = new Book(102922, "42100", "Miss Peregrine's Home for Peculiar Children", false, "");
        Book book2 = new Book(102923, "42101", "Vanity Fair", false, "");
        Book book3 = new Book(102924, "42102", "Three Sixes and a Forked Tongue, or Cold Medicine and a Liar", false, "");
        Book book4 = new Book(102925, "42103", "Miss Mapp", false, "");
        Book book5 = new Book(102926, "42104", "Kindred", false, "");
        Book book6 = new Book(102927, "42105", "The Atlas Six", false, "");
        Book book7 = new Book(102928, "42106", "Reasons to Stay Alive", false, "");
        Book book8 = new Book(102929, "42107", "Loveless", false, "");
        Book book9 = new Book(102930, "42108", "Belong to Me", false, "");
        Book book10 = new Book(102923, "42101", "Space Opera", false, "");
        Book book11 = new Book(102924, "42102", "Lapvona", false, "");
        Book book12 = new Book(102925, "42103", "The Village Anomaly", false, "");
        Book book13 = new Book(102926, "42104", "New York 2140", false, "");
        Book book14 = new Book(102927, "42105", "Black Hills", false, "");
        Book book15 = new Book(102928, "42106", "The Long Dry", false, "Timmy");
        Book book16 = new Book(102929, "42107", "Luna: New Moon", false, "");
        Book book17 = new Book(102930, "42108", "Strange Sally Diamond", false, "");
        Book book18 = new Book(102931, "42108", "Forevermore", false, "");
        Book book19 = new Book(102932, "42108", "My Work is Not Yet Done: Three Tales of Corporate Horror", false, "");
        Book book20 = new Book(102933, "42108", "Fell", false, "");

        // Store book objects in the array
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        books[4] = book5;
        books[5] = book6;
        books[6] = book7;
        books[7] = book8;
        books[8] = book9;
        books[9] = book10;
        books[10] = book11;
        books[11] = book12;
        books[12] = book13;
        books[13] = book14;
        books[14] = book15;
        books[15] = book16;
        books[16] = book17;
        books[17] = book18;
        books[18] = book19;
        books[19] = book20;

        // Display start menu options
        System.out.println("Welcome to the library! What would you like to do?");
        System.out.println("1: Show available books");
        System.out.println("2: Show checked out books");
        System.out.println("3: Check in your books");
        System.out.println("4: Exit- close out application");
        // Code has to read the user input for menu selection
        int command = scanner.nextInt();
        // Process choices until time to exit
        while (command != 5) {
            switch (command) {
                case 1:
                    availableBooks(books, scanner);
                    break;
                case 2:
                    checkedOutBooks(books);
                    break;
                case 3:
                    checkInBook(books, scanner);
                    break;
                case 4:
                    exitApplication(books);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Invalid command!");
            }
            // Ask user to enter command
            System.out.println("Enter your command: ");
            command = scanner.nextInt();
        }
    }

    // Method for checking in their book
    private static void checkInBook(Book[] books, Scanner scanner) {
        System.out.println("Please enter the book ID to check in:");
        int id = scanner.nextInt();
        boolean found = false;
        // Check if the selected book is available for check-in
        for (Book book : books) {
            if (book != null && book.getId() == id && book.isCheckedOut()) {
                // Check in the book
                book.setCheckedOut(false);
                book.setCheckedOutTo("");
                System.out.println("Book checked in successfully!");
                found = true;
                break;
            }
        }
    }

    // Method to exit application
    private static void exitApplication(Book[] books) {
        System.exit(0);
    }

    // Method to see all available books
    private static void availableBooks(Book[] books, Scanner scanner) {
        System.out.println("Available books: ");
        for (Book book : books) {
            // Display all books
            if (book != null && !book.isCheckedOut()) {
                System.out.println(book);
            }
        }
        // Prompt the user to check out a book
        System.out.println("Would you like to check out a book? (Y/N)");
        String choice = scanner.next();
        // User choice for book checkout
        if (choice.equalsIgnoreCase("Y")) {
            System.out.println("Enter your name");
            String user = scanner.next();
            System.out.println("Please enter the book ID");
            int id = scanner.nextInt();
            boolean found = false;
            // Check and see if the selected book is in stock
            for (Book book : books) {
                if (book != null && book.getId() == id) {
                    if (book.isCheckedOut()) {
                        // Unfortunately inform the user that the book is checked out
                        System.out.println("Sorry, this book is currently checked out!");
                    } else {
                        // Checkout the book to user
                        book.setCheckedOut(true);
                        book.setCheckedOutTo(user);
                        System.out.println("Book checked out successfully!");
                        found = true;
                        break;
                    }

                }
            }
        }
    }
        // Method to see all checked out books
        private static void checkedOutBooks(Book[] books) {
            System.out.println("Checked out books:");
            for (Book book : books) {
                if (book != null && book.isCheckedOut()) {
                    System.out.println(book);
                }
            }
        }
    }
    // End of code