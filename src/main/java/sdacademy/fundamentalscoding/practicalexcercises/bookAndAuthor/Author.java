package sdacademy.fundamentalscoding.practicalexcercises.bookAndAuthor;

public class Author {
    private String name;
    private String email;
    private String phonenumber;

    public Author(String name, String email, String phonenumber) {
        this.name = name;
        this.email = email;
        this.phonenumber = phonenumber;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getPhonenumber() {
        return phonenumber;
    }
    public String toString() {
        return String.format("Autoriaus vardas: %s, pastas: %s", name, email);
    }

}

