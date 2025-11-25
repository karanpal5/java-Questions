class Book {
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

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

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You borrowed: " + title);
        } else {
            System.out.println("Sorry, " + title + " is already borrowed.");
        }
    }

    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("You returned: " + title);
        } else {
            System.out.println("This book was not borrowed.");
        }
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Book b1 = new Book("The Bhagavad Gita", "Vyasa");
        System.out.println("Book: " + b1.getTitle() + " by " + b1.getAuthor());
        System.out.println("Available? " + b1.isAvailable());
        b1.borrowBook();
        System.out.println("Available? " + b1.isAvailable());
        b1.borrowBook();
        b1.returnBook();
        System.out.println("Available? " + b1.isAvailable());
    }
}
