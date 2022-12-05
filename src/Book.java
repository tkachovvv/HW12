class Book {
    String bookName;
    private String author;
    int publishingDate;
    Book(String bookName, String author, int publishingDate) {
        this.bookName = bookName;
        this.author = author;
        this.publishingDate = publishingDate;
    }
    String getBookName() {
        return this.bookName;
    }
    String getAuthor() {
        return this.author;
    }
    int getPublishingDate() {
        return this.publishingDate;
    }
    void setPublishingDate(int publishingDate) {
        this.publishingDate = publishingDate;
    }

}
