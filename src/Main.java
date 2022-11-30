public class Main {
    public static void main (String[]args) {
        Author author = new Author ("Lyubko Deresh");
        Book book = new Book ("A Bit of Darkness ", "Lyubko Deresh " , 2007);
        book.getAuthor().equals(author.getName());
        System.out.println(book.getBookName() + book.getAuthor() + " " + book.getPublishingDate());
        Author author1 = new Author ("Virginia Woolf");
        Book book1 = new Book ("White Fang ", "Virginia Woolf ", 1906);
        book1.setPublishingDate(1908);
        System.out.println("book1.getPublishingDate() = " + book1.getPublishingDate());
        System.out.println(book1.getBookName() + book1.getAuthor() + book1.getPublishingDate());
        System.out.println("author.getName() = " + author.getName());
        System.out.println(author1.getName());

    }
}