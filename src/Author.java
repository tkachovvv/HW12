import java.util.Objects;
public class Author {
    private final String name;
    private final String surname;

    Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public String getName() {

        return this.name;
    }

    public String getSurname() {

        return this.surname;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }
    @Override
    public boolean equals(Object author1) {
        if (this.getClass() != author1.getClass()) {
            return false;
        }
        Author author = (Author) author1;
        return author.equals(author1);
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(name,surname);
    }
}