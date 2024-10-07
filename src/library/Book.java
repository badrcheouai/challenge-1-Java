package library;

public class Book {
    private String title;
    private String author;
    private boolean isAvailable;
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }
    public void borrowBook() {
        if (isAvailable) {
            this.isAvailable = false;
            System.out.println("Book has been successfully borrowed!");
        }
        else {
            System.out.println("Book is already borrowed!");
        }

    }
    public void returnBook() {
        if (!isAvailable) {
            this.isAvailable = true;
            System.out.println("Book has been returned!");
        }
        else {
            System.out.println("Book is already borrowed!");
        }
    }
    public String getBookInfo() {
        return "Title: " + this.title + "\nAuthor: " + this.author + "\nBook available: " + this.isAvailable;
    }
}
