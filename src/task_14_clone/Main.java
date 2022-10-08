package task_14_clone;

import books.Book;

public class Main {
    public static void main(String[] args){
        Book book = new Book("TITLE", "AUTHOR", 15, "978-3-16-148410-2");
        Book clone = book.clone();

        System.out.println(book);
        System.out.println(clone);
    }
}