package MiniProject;


import MiniProject.User;
import MiniProject.Book;
import MiniProject.Library;
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        User user = new User(library);
        user.start();
    }
}
