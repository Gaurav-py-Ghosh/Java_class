/**
 * Problem Statement:
Develop a Library Management System using Java.

Requirements:
Define Book Class:
Attributes: bookId (int), title (String), author (final String), availableCopies (int).
Constructor to initialize attributes.
Methods:
borrowBook(): Decreases availableCopies if a book is borrowed.
Main Class:
Use a 1-D array of Book objects to store 5 books.
Implement a switch case for the following operations:
1: Borrow a book (reduce availableCopies if available).
2: Display details of all books.
Use Scanner to get user input.
 */
import java.util.Scanner;

// Define Book class
class Book {
    private int bookId;
    private String title;
    private final String author;
    private int availableCopies;

    // Constructor to initialize attributes
    public Book(int bookId, String title, String author, int availableCopies) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.availableCopies = availableCopies;
    }

    // Method to borrow a book
    public boolean borrowBook() {
        if (availableCopies > 0) {
            availableCopies--;
            return true;
        } else {
            return false; // No available copies left
        }
    }

    // Display book details
    public void displayBookDetails() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available Copies: " + availableCopies);
        System.out.println("---------------------------------");
    }
}

// Main class
public class Library {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating a 1-D array of Book objects to store 5 books
        Book[] books = new Book[5];
        books[0] = new Book(1, "Java Programming", "James Gosling", 3);
        books[1] = new Book(2, "Python Basics", "Guido van Rossum", 2);
        books[2] = new Book(3, "Data Structures", "Robert Lafore", 5);
        books[3] = new Book(4, "Database Management", "Raghu Ramakrishnan", 4);
        books[4] = new Book(5, "Operating Systems", "Abraham Silberschatz", 1);

        int choice;
        do {
            // Display menu
            System.out.println("Library Management System");
            System.out.println("1: Borrow a book");
            System.out.println("2: Display details of all books");
            System.out.println("3: Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Borrow a book
                    System.out.print("Enter the Book ID to borrow: ");
                    int bookId = scanner.nextInt();
                    boolean found = false;

                    for (Book book : books) {
                        if (book != null && bookId == bookId) {
                            found = true;
                            if (book.borrowBook()) {
                                System.out.println("You have successfully borrowed the book.");
                            } else {
                                System.out.println("Sorry, no available copies left.");
                            }
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Book not found.");
                    }
                    break;

                case 2:
                    // Display details of all books
                    for (Book book : books) {
                        book.displayBookDetails();
                    }
                    break;

                case 3:
                    System.out.println("Exiting the system...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);

        scanner.close();
    }
}






