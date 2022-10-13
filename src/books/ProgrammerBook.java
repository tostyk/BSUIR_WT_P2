package books;

public class ProgrammerBook extends Book{
    private String language;
    private int level;

    public ProgrammerBook(String title, String author, int price, String isbn, String language, int level) {
        super(title, author, price, isbn);
        this.language = language;
        this.level = level;
    }
    // task 13
    @Override
    public boolean equals(Object obj){
        if(this == obj) { return true; }
        if(obj == null) { return false; }
        if(obj.getClass() == getClass()){
            ProgrammerBook book = (ProgrammerBook)obj;
            return  this.getTitle().equals(book.getTitle()) &&
                    this.getAuthor().equals(book.getAuthor()) &&
                    this.getPrice() == book.getPrice() &&
                    this.getIsbn().equals(book.getIsbn()) &&
                    this.level == book.level &&
                    this.language.equals(book.language);
        }
        return false;
    }

    @Override
    public int hashCode(){
        int hashCode;
        hashCode = super.hashCode();
        hashCode += level;
        hashCode += ((language == null) ? 0: language.hashCode());
        return hashCode;
    }

    @Override
    public String toString(){
        String str = "";
        str = getClass().getName() + ": title = " + getTitle() +
                ", author = " + getAuthor() +
                ", price = " + getPrice() +
                ", edition = " + getEdition() +
                ", isbn = " + getIsbn() +
                ", level = " + level +
                ", language = " + language;
        return str;
    }

    public int getLevel() {
        return level;
    }

    public String getLanguage() {
        return language;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}