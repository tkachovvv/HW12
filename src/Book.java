import java.util.Objects;
public class Book {
    private final String bookName;
    private final String author;
    private int publishingDate;
    Book(String bookName, String author, int publishingDate) {
        this.bookName = bookName;
        this.author = author;
        this.publishingDate = publishingDate;
    }
    public String getBookName() {
        return this.bookName;
    }
    public String getAuthor() {
        return this.author;
    }
    public int getPublishingDate() {
        return this.publishingDate;
    }
    public void setPublishingDate(int publishingDate) {
        this.publishingDate = publishingDate;
    }
        @Override
        public String toString() {
            return bookName + publishingDate + " " + author.toString();
    }
        @Override
        public boolean equals(Object book1) {
            if (this.getClass() != book1.getClass()) {
                return false;
            }
            Book book = (Book) book1;
            return book.equals(book1);
        }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(bookName, author, publishingDate);
    }
}
