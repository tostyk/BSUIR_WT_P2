package task_14_comparable;

import books.Book;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args){
        TreeSet<Book> books = new TreeSet<>();
        books.add(new Book("TITLE", "AUTHOR", 15, "978-3-16-148410-2"));
        books.add(new Book("TITLE", "AUTHOR", 15, "978-3-16-148410-0"));
        books.add(new Book("TITLE", "AUTHOR", 15, "978-3-16-148410-1"));
        books.add(new Book("TITLE", "AUTHOR", 15, "978-3-16-148410-6"));
        books.add(new Book("TITLE", "AUTHOR", 15, "978-3-16-148401-5"));
        books.add(new Book("TITLE", "AUTHOR", 15, "978-3-16-148488-5"));

        for (Book book: books){
            System.out.println(book);
        }
    }
}