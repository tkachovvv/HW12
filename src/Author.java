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
}