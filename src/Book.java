import java.util.Objects;
public class Book {
    private final String bookName;
    private Author authorFullName;
    private int publishingDate;
    Book(String bookName, Author authorFullName, int publishingDate) {
        this.bookName = bookName;
        this.publishingDate = publishingDate;
        this.authorFullName = authorFullName;
    }
    public String getBookName() {

        return bookName;
    }
    public String getAuthor () {
        return authorFullName.getFirstName() + authorFullName.getLastName();
    }
    public int getPublishingDate() {

        return publishingDate;
    }
    public void setPublishingDate(int publishingDate) {

        this.publishingDate = publishingDate;
    }
        public void getBookInfo() {
        System.out.print(bookName + publishingDate + " " + authorFullName);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookName.equals(book.bookName) && authorFullName.equals(book.authorFullName);
        }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(bookName, authorFullName, publishingDate);
    }
}
