public class Main {
    public static void main (String[]args) {
        Author author = new Author ("Lyubko ", "Deresh");
        Book book = new Book ("A Bit of Darkness ", author , 2007);
        Author author1 = new Author ("Virginia ", "Wolf");
        Book book1 = new Book ("White Fang ", author1, 1906);
        book1.setPublishingDate(1908);
        book.getBookInfo();
        book1.getBookInfo();
        author.getInfoAuthor();
        author1.getInfoAuthor();
        System.out.println(book.hashCode());
        System.out.println(author1.hashCode());
    }
}