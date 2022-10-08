package comparators;

import books.Book;

import java.util.Comparator;

public class BookComparatorByPrice implements Comparator<Book> {
        @Override
        public int compare(Book b1, Book b2) {
            return b1.getPrice() - b2.getPrice();
        }
    }
