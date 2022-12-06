public class Main {
    public static void main (String[]args) {
        Author author = new Author ("Lyubko ", "Deresh");
        Book book = new Book ("A Bit of Darkness ", "Lyubko Deresh " , 2007);
        Author author1 = new Author ("Virginia ", "Wolf");
        Book book1 = new Book ("White Fang ", "Virginia Woolf ", 1906);
        book1.setPublishingDate(1908);
        System.out.println(book1.toString());
        System.out.println(book.toString());
        System.out.println(author.toString());
        System.out.println(author1.toString().equals(author.toString()));
        System.out.println(book1.toString().equals(book.toString()));
        System.out.println(book.hashCode());
        System.out.println(author1.hashCode());
    }
}