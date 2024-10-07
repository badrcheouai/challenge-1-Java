//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import library.Book;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Please enter the name of the book: ");

        String BookName = Input.nextLine();
        System.out.println("Please enter the author of the book: ");
        String Author = Input.nextLine();
        Book FirstBook = new Book(BookName, Author);

        System.out.println(FirstBook.getBookInfo());
        FirstBook.borrowBook();
        FirstBook.returnBook();
        }
    }
