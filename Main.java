
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Book book = new Book(
                new Author("Егор", "Малинин", 9),
                "Холодная Погода",
                1965,
                1000);


        System.out.println(book.isBig());
        System.out.println(book.estimatePrice());
        System.out.println(book.matches("Холодная Погода"));


    }
}