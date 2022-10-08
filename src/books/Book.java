package books;

import java.lang.Comparable;

public class Book implements Comparable<Book>{
    private String title;
    private String author;
    private int price;
    private static int edition;
    private String isbn;

    public Book(){
        title = "";
        author = "";
        price = 0;
        isbn = "";
    }

    public Book(String title, String author, int price, String isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    // task 12
    @Override
    public boolean equals(Object obj){
        if(obj.getClass() == getClass()){
            Book book = (Book)obj;
            return  this.title.equals(book.title) &&
                    this.author.equals(book.author) &&
                    this.price == book.price &&
                    this.isbn.equals(book.isbn);
        }
        return false;
    }

    @Override
    public int hashCode(){
        int hashCode = 1;
        hashCode += ((title == null) ? 0: title.hashCode());
        hashCode += ((author == null) ? 0: author.hashCode());
        hashCode += ((isbn == null) ? 0: isbn.hashCode());
        hashCode += price;
        return hashCode;
    }

    @Override
    public String toString(){
        String str = "";
        str = "title: " + title +
                ", author: " + author +
                ", price: " + price +
                ", edition: " + edition +
                ", isbn: " + isbn;
        return str;
    }

    // task 15
    public int compareTo(Book book){
        return this.isbn.compareTo(book.isbn);
    }

    public static void setEdition(int edition) {
        Book.edition = edition;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public static int getEdition() {
        return edition;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public Book clone(){
        Book book = new Book();
        book.title = String.copyValueOf(this.title.toCharArray());
        book.author = String.copyValueOf(this.author.toCharArray());
        book.price = this.price;
        book.isbn = String.copyValueOf(this.isbn.toCharArray());
        return book;
    }
}
