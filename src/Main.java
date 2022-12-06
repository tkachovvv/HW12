public class Main {
    public static void main (String[]args) {
        Author author = new Author ("Lyubko ", "Deresh");
        Book book = new Book ("A Bit of Darkness ", "Lyubko Deresh " , 2007);
        Author author1 = new Author ("Virginia ", "Wolf");
        Book book1 = new Book ("White Fang ", "Virginia Woolf ", 1906);
        book1.setPublishingDate(1907);
        System.out.println(book.getBookName() + author.getName() + author.getSurname() + " " + book.getPublishingDate());
        System.out.println(book1.getPublishingDate());
        System.out.println(book1.getBookName() + author1.getName() + author1.getSurname() + " " + book1.getPublishingDate());
    }
}