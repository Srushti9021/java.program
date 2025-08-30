class Book {
    // Attributes of the Book class
    private String title;
    private String author;
    private String ISBN;

    // Constructor for Book
    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    // Getters and setters for Book attributes
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getISBN() {
        return ISBN;
    }
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    // Method to display book information
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
    }
}
// Derived class: LibraryBook which inherits from Book
class LibraryBook extends Book {
    private boolean isAvailable;

    // Constructor for LibraryBook
    public LibraryBook(String title, String author, String ISBN, boolean isAvailable) {
        // Call to the parent class constructor
        super(title, author, ISBN);
        this.isAvailable = isAvailable;
    }

    // Getter and setter for availability
    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    // Overridden method to display LibraryBook info, including availability
    @Override
    public void displayInfo() {
        super.displayInfo();  // Call parent class displayInfo()
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }
}

public class LibraryApp {
    public static void main(String[] args) {
        // Create an instance of LibraryBook
        LibraryBook libraryBook = new LibraryBook("Java Programming", "John Doe", "1234567890", true);
        
        // Display the information of the library book
        libraryBook.displayInfo();
    }
}

