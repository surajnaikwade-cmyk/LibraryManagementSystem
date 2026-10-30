package LibraryManagementSystem;

public class Main {

    public static void main(String[] args) {

        Library library = new Library();
        InputHandler input = new InputHandler();

        int choice = 0;

        System.out.println("   LIBRARY MANAGEMENT SYSTEM");
        System.out.println("\nWelcome to the Library Management System!\n");


        do {

            System.out.println("\n MAIN MENU ");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Search Book");
            System.out.println("4. Register User");
            System.out.println("5. View Users");
            System.out.println("6. Issue Book");
            System.out.println("7. Return Book");
            System.out.println("8. Remove Book");
            System.out.println("9. View Issue History");
            System.out.println("10. Exit");

            choice = input.readInt("Enter your choice: ");

            switch (choice) {

                // Add Book
                case 1: {
                    int id = input.readInt("Enter Book ID: ");

                    String title = input.readString(
                            "Enter Book Title: ");

                    String author = input.readString(
                            "Enter Author Name: ");

                    Book book = new Book(id, title, author);

                    library.addBook(book);
                    break;
                }

                // View Books
                case 2: {
                    library.displayBooks();
                    break;
                }

                // Search Book
                case 3: {

                    System.out.println("1. Search by ID");
                    System.out.println("2. Search by Title");

                    int searchChoice = input.readInt(
                            "Choose search option: ");

                    if (searchChoice == 1) {

                        int id = input.readInt(
                                "Enter Book ID: ");

                        Book book = library.searchBookById(id);

                        if (book != null) {
                            book.displayBook();
                        } else {
                            System.out.println("Book not found.");
                        }

                    } else if (searchChoice == 2) {

                        String title = input.readString(
                                "Enter Book Title: ");

                        Book book = library.searchBookByTitle(title);

                        if (book != null) {
                            book.displayBook();
                        } else {
                            System.out.println("Book not found.");
                        }

                    } else {
                        System.out.println("Invalid search option.");
                    }

                    break;
                }

                // Register User
                case 4: {

                    int userId = input.readInt(
                            "Enter User ID: ");

                    String name = input.readString(
                            "Enter User Name: ");

                    String email = input.readString(
                            "Enter Email: ");

                    User user = new User(userId, name, email);

                    library.addUser(user);
                    break;
                }

                // View Users
                case 5: {
                    library.displayUsers();
                    break;
                }

                // Issue Book
                case 6: {

                    int bookId = input.readInt(
                            "Enter Book ID: ");

                    int userId = input.readInt(
                            "Enter User ID: ");

                    library.issueBook(bookId, userId);
                    break;
                }

                // Return Book
                case 7: {

                    int bookId = input.readInt(
                            "Enter Book ID to return: ");

                    library.returnBook(bookId);
                    break;
                }

                // Remove Book
                case 8: {

                    int bookId = input.readInt(
                            "Enter Book ID to remove: ");

                    library.removeBook(bookId);
                    break;
                }

                // View Issue History
                case 9: {
                    library.displayIssueRecords();
                    break;
                }

                // Exit
                case 10: {
                    System.out.println(
                            "Thank you for using Library Management System!");
                    break;
                }

                default: {
                    System.out.println(
                            "Invalid choice! Please try again.");
                }
            }

        } while (choice != 10);

        input.close();
    }
}
