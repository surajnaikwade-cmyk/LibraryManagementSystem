package LibraryManagementSystem;

import java.time.LocalDate;

public class IssueRecord {

    private int recordId;
    private Book book;
    private User user;
    private LocalDate issueDate;
    private LocalDate returnDate;

    // Constructor
    public IssueRecord(int recordId, Book book, User user) {
        this.recordId = recordId;
        this.book = book;
        this.user = user;
        this.issueDate = LocalDate.now();
        this.returnDate = null;
    }

    public int getRecordId() {
        return recordId;
    }

    public Book getBook() {
        return book;
    }

    public User getUser() {
        return user;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    // Mark book as returned
    public void markReturned() {
        this.returnDate = LocalDate.now();
    }

    // Check whether book is still issued
    public boolean isActive() {
        return returnDate == null;
    }

    // Display issue record
    public void displayRecord() {
        System.out.println("Record ID: " + recordId);
        System.out.println("Book: " + book.getTitle());
        System.out.println("User: " + user.getName());
        System.out.println("Issue Date: " + issueDate);
        System.out.println("Return Date: " +
                (returnDate == null ? "Not Returned" : returnDate));
    }
}
