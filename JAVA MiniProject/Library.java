package MiniProject;

import java.util.ArrayList;
import MiniProject.Book;
public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
        initializeDefaultBooks();
    }

    private void initializeDefaultBooks() { // adds default book
        books.add(new Book("To Kill a Mockingbird", "Harper Lee", 10.99));
        books.add(new Book("1984", "George Orwell", 8.99));
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 12.99));
        books.add(new Book("Moby Dick", "Herman Melville", 11.50));
        books.add(new Book("Pride and Prejudice", "Jane Austen", 9.99));
    }

    public void addBook(Book book) {
        books.add(book); // adds book to arraylist
    }

    public boolean borrowBook(String title) {
        boolean a;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().equalsIgnoreCase(title)) {
                books.get(i).borrowBook(); // goes in book file and changes value of isavailabe 
                a=true;
            }
            else{
                a=false;
            }
        }
        if(a=false){

            System.out.println("Book not found.");
            return false;
        }
        else{
            System.out.println("Book  found.");
            return true;
        }
    }

    public boolean returnBook(String title) {
        boolean a;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().equalsIgnoreCase(title)) {
                books.get(i).returnBook(); // goes in book file and changes value of isavailabe 
                a=true;
            }
            else{
                a=false;
            }
        }
        if(a=false){

            System.out.println("Book not found.");
            return false;
        }
        else{
            System.out.println("Book  found.");
            return true;
        }
    }

    public void displayBooks() {
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
        }
    }
}
