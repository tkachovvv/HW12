public class Main {
    public static void main (String[]args) {
        Author author = new Author ("Lyubko ", "Deresh");
        Book book = new Book ("A Bit of Darkness ", "Lyubko Deresh " , 2007);
        System.out.println(book.getBookName() + book.getAuthor() + " " + book.getPublishingDate());
        Author author1 = new Author ("Virginia ", "Wolf");
        Book book1 = new Book ("White Fang ", "Virginia Woolf ", 1906);
        book1.setPublishingDate(1908);
        System.out.println(book1.getPublishingDate());
        System.out.println(author.getName() + author.getSurname());
        System.out.println(author1.getName() + author1.getSurname());
        System.out.println(book1.getBookName() + book1.getAuthor() + " " + book1.getPublishingDate());
    }
}