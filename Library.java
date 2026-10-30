package LibraryManagementSystem;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private ArrayList<User> users;
    private ArrayList<IssueRecord> issueRecords;

    private int nextRecordId = 1;


    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
        issueRecords = new ArrayList<>();
    }

    // Add Book
    public void addBook(Book book) {

        if (searchBookById(book.getBookId()) != null) {
            System.out.println("Book ID already exists.");
            return;
        }

        books.add(book);
        System.out.println("Book added successfully!");
    }

    // Display Books
    public void displayBooks() {

        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        for (Book book : books) {
            book.displayBook();
            System.out.println("-------------------");
        }
    }

    // Search Book By ID
    public Book searchBookById(int id) {

        for (Book book : books) {
            if (book.getBookId() == id) {
                return book;
            }
        }

        return null;
    }

    // Search Book By Title
    public Book searchBookByTitle(String title) {

        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }

        return null;
    }

    // Remove Book
    public void removeBook(int id) {

        Book book = searchBookById(id);

        if (book == null) {
            System.out.println("Book not found.");
        }
        else if (!book.isAvailable()) {
            System.out.println("Cannot remove an issued book.");
        }
        else {
            books.remove(book);
            System.out.println("Book removed successfully.");
        }
    }

    // Register User
    public void addUser(User user) {

        if (searchUserById(user.getUserId()) != null) {
            System.out.println("User ID already exists.");
            return;
        }

        users.add(user);
        System.out.println("User registered successfully!");
    }

    // Display Users
    public void displayUsers() {

        if (users.isEmpty()) {
            System.out.println("No registered users.");
            return;
        }

        for (User user : users) {
            user.displayUser();
            System.out.println("-------------------");
        }
    }

    // Search User By ID
    public User searchUserById(int id) {

        for (User user : users) {
            if (user.getUserId() == id) {
                return user;
            }
        }

        return null;
    }

    // Issue Book To User
    public void issueBook(int bookId, int userId) {

        Book book = searchBookById(bookId);
        User user = searchUserById(userId);

        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        if (user == null) {
            System.out.println("User not found.");
            return;
        }

        if (!book.isAvailable()) {
            System.out.println("Book is already issued.");
            return;
        }

        book.setAvailable(false);

        IssueRecord record = new IssueRecord(
                nextRecordId++, book, user
        );

        issueRecords.add(record);

        System.out.println("Book issued successfully!");
        System.out.println("Issued to: " + user.getName());
    }

    // Return Book
    public void returnBook(int bookId) {

        Book book = searchBookById(bookId);

        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        if (book.isAvailable()) {
            System.out.println("Book is already available.");
            return;
        }

        for (IssueRecord record : issueRecords) {

            if (record.getBook().getBookId() == bookId
                    && record.isActive()) {

                record.markReturned();
                book.setAvailable(true);

                System.out.println("Book returned successfully!");
                System.out.println(
                        "Returned by: " + record.getUser().getName()
                );

                return;
            }
        }

        System.out.println("Active issue record not found.");
    }

    // Display Issue History
    public void displayIssueRecords() {

        if (issueRecords.isEmpty()) {
            System.out.println("No issue records available.");
            return;
        }

        for (IssueRecord record : issueRecords) {
            record.displayRecord();
            System.out.println("-------------------");
        }
    }
}
