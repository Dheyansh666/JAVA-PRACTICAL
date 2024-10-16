package MiniProject;
 
import java.util.Scanner;
public class User {
    private Library library;
    private Scanner scanner;

    public User(Library library) {
        this.library = library;
        scanner = new Scanner(System.in);
    }

    public void start() {
        OUTER: // type of lable or goto statement
        while (true) {
            System.out.println("1. Add Book");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. Display Books");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    borrowBook();
                    break;
                case 3:
                    returnBook();
                    break;
                case 4:
                    library.displayBooks();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break OUTER;
                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }
        }
    }

    private void addBook() {
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter book author: ");
        String author = scanner.nextLine();
        System.out.print("Enter book price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();  // Consume newline
        Book book = new Book(title, author, price); // creates obj of book class
        library.addBook(book); // calls function in library file 
        System.out.println("Book added successfully.");
    }

    private boolean borrowBook() {
        System.out.print("Enter book title to borrow: ");
        String title = scanner.nextLine();
        return library.borrowBook(title); // goes to library
    }

    private boolean returnBook() {
        System.out.print("Enter book title to return: ");
        String t = scanner.nextLine();
        return library.returnBook(t); // goes to bibrary
    }
}
