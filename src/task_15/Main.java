package task_15;

import books.Book;
import comparators.BookComparatorByTitle;
import comparators.BookComparatorByAuthor;
import comparators.BookComparatorByPrice;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Дневники Зевса", "Морис Дрюон", 15, "978-5-699-37763-3"));
        books.add(new Book("Двенадцать стульев","И. Ильф, Е. Петров",  13, "5-320-00274-2"));
        books.add(new Book("Война и мир. Книга 1.","Л.Н.Толстой",  14, "978-5-17-060765-5"));
        books.add(new Book("Анна Каренина", "Л.Н.Толстой", 11, " 978-5-389-19086-3"));
        books.add(new Book("Сияние", "Стивен Кинг", 16, "978-5-17-080493-1"));

        Comparator<Book> comparatorByTitle = new BookComparatorByTitle();
        Comparator<Book> comparatorByAuthor = new BookComparatorByAuthor();
        Comparator<Book> comparatorByAuthorTitle = comparatorByTitle.thenComparing(comparatorByAuthor);
        Comparator<Book> comparatorByTitleAuthor = comparatorByAuthor.thenComparing(comparatorByTitle);
        Comparator<Book> comparatorByAuthorTitlePrice = comparatorByAuthorTitle.thenComparing(new BookComparatorByPrice());

        books.sort(comparatorByTitle);
        System.out.println("Sorted by title:");
        for (Book book: books){
            System.out.println(book);
        }
        books.sort(comparatorByAuthor);
        System.out.println("Sorted by author:");
        for (Book book: books){
            System.out.println(book);
        }
        books.sort(comparatorByAuthorTitle);
        System.out.println("Sorted by title and author:");
        for (Book book: books){
            System.out.println(book);
        }
        books.sort(comparatorByTitleAuthor);
        System.out.println("Sorted by author and title:");
        for (Book book: books){
            System.out.println(book);
        }
        books.sort(comparatorByAuthorTitlePrice);
        System.out.println("Sorted by author, title and price:");
        for (Book book: books){
            System.out.println(book);
        }
    }
}