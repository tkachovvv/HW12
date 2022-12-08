import java.util.Objects;
public class Author {
    public String firstName;
    public String lastName;

    Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {

        return this.firstName;
    }

    public String getLastName() {

        return this.lastName;
    }

    public void getInfoAuthor () {
        System.out.print(firstName + lastName);
        System.out.println("");
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return firstName.equals(author.firstName) && lastName.equals(author.lastName);
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(firstName,lastName);
    }
    public String toString() {
        return firstName + " " + lastName;
    }
}