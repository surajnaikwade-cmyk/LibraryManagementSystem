# Library Management System

## Project Overview

The Library Management System is a console-based Java application

The application helps manage library operations, including book management, user registration, book issuing, book returns, and issue history tracking.

The project demonstrates Java fundamentals, Object-Oriented Programming (OOP), collections, input validation, and modular application design.

## Objectives

- Understand Java classes and objects.
- Implement encapsulation and constructors.
- Use ArrayList to manage books, users, and issue records.
- Implement menu-driven console interaction.
- Apply input validation.
- Maintain book issuing and return history.
- Organize code into separate classes.

## Features

### 1. Book Management
- Add new books.
- View all books.
- Search books by ID or title.
- Remove available books.
- Prevent duplicate book IDs.

### 2. User Management
- Register library users.
- Store user ID, name, and email.
- View registered users.
- Prevent duplicate user IDs.

### 3. Book Issue Management
- Issue books to registered users.
- Check book availability.
- Prevent issuing an already-issued book.
- Record issue dates.
- Track which user borrowed each book.

### 4. Book Return Management
- Return issued books.
- Update book availability.
- Record return dates.
- Maintain previous issue records.

### 5. Issue History
- View all issue records.
- Display book details.
- Display user details.
- Display issue and return dates.

## Technologies Used

- Java
- Object-Oriented Programming
- ArrayList
- Scanner
- LocalDate
- Java Collections Framework

## Project Structure

```text
LibraryManagementSystem/
│
├── Book.java
├── Library.java
├── Main.java
├── User.java
├── IssueRecord.java
├── InputHandler.java
│
├── README.md
├── .gitignore
│
└── out/                 (Generated during compilation)
```

## Class Responsibilities

| Class         | Responsibility |

| Book          | Stores book information and availability |
| Library       | Manages books, users, and library operations |
| Main          | Provides the main menu and application flow |
| User          | Stores library member information |
| IssueRecord   | Maintains book issue and return history |
| InputHandler  | Handles console input and validation |

## How to Run the Project

### Prerequisites

- Java Development Kit (JDK 17 or later recommended)
- Visual Studio Code or another Java IDE
- Java compiler (`javac`)

### Step 1: Clone the repository

```bash
git clone https://github.com/surajnaikwade-cmyk/LibraryManagementSystem.git
```

### Step 2: Open the project directory

```bash
cd LibraryManagementSystem
```

### Step 3: Compile the Java files

```powershell
javac -d out *.java
```

### Step 4: Run the application

```powershell
java -cp out LibraryManagementSystem.Main
```

## Application Menu

```text

   LIBRARY MANAGEMENT SYSTEM


 MAIN MENU 
1. Add Book
2. View Books
3. Search Book
4. Register User
5. View Users
6. Issue Book
7. Return Book
8. Remove Book
9. View Issue History
10. Exit

Enter your choice:
```

## Sample Execution

### Register a User

```text
Enter User ID: 101
Enter User Name: Suraj
Enter Email: suraj@example.com

User registered successfully!
```

### Issue a Book

```text
Enter Book ID: 201
Enter User ID: 101

Book issued successfully!
Issued to: Suraj
```

### Return a Book

```text
Enter Book ID to return: 201

Book returned successfully!
Returned by: Suraj
```

## Concepts Demonstrated

- Classes and Objects
- Constructors
- Encapsulation
- Getters and Setters
- ArrayList
- Enhanced For Loop
- Conditional Statements
- Switch Statements
- Methods and Method Calls
- Input Validation
- LocalDate
- Object Relationships

## Future Enhancements

- Store library information in files or a database.
- Add book categories.
- Implement book due dates.
- Add overdue book tracking.
- Introduce member borrowing limits.

## Data Storage

This version uses ArrayList for storing books, users, and issue records during application execution. Data is maintained in memory and is not persisted after the application closes.

## Author

**Name:** Suraj Naikwade


---

