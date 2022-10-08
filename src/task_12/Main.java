package task_12;

import books.Book;

public class Main{
    public static void main(String[] args){
        Book.setEdition(1);
        Book book1 = new Book("TITLE", "AUTHOR", 15, "978-3-16-148410-2");
        Book book2 = new Book("TITLE", "AUTHOR", 15, "978-3-16-148410-2");
        Book book3 = new Book("title", "author", 10, "978-3-16-148410-1");

        if (book1.equals(book2)) {
            System.out.println("book1 == book2");
        } else{
            System.out.println("book1 != book2");
        }
        if (book3.equals(book2)) {
            System.out.println("book3 == book2");
        } else{
            System.out.println("book3 != book2");
        }
        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(book3.toString());

        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
        System.out.println(book3.hashCode());
    }
}