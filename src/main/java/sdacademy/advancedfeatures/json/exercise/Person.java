package sdacademy.advancedfeatures.json.exercise;

public class Person {

    private String name;
    private String surname;
    private int[] phone;

    public Person(String name, String surname, int[] phone) {
        this.name = name;
        this.surname = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int[] getPhone() {
        return phone;
    }
}
