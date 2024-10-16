package MiniProject;

public class Book {
    private String title;
    private String author;
    private boolean isAvailable;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public boolean  borrowBook() {
        if (isAvailable) {
            isAvailable = false;
        } else {
            System.out.println("Book is not available.");
        }
        return isAvailable;
    }

    public void returnBook() {
        isAvailable = true;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Price: $" + price + ", Available: " + isAvailable;
    }
}
