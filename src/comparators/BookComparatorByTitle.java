package comparators;

import books.Book;
import java.util.Comparator;

public class BookComparatorByTitle implements Comparator<Book>{
    @Override
    public int compare(Book b1, Book b2) {
        return b1.getTitle().compareToIgnoreCase(b2.getTitle());
    }
}
