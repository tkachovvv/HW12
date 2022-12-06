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

}
