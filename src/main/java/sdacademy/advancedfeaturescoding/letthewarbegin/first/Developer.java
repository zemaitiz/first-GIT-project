package sdacademy.advancedfeaturescoding.letthewarbegin.first;

import java.awt.SystemTray;
import java.util.List;

public class Developer extends Person {

    List<String> languages;

    public Developer(List<String> languages, String name, int age) {
        super(name, age);
        this.languages = languages;
        System.out.println("This developer know these language" + languages);
    }

    public void isJavaDeveloper() {

        if (languages.stream()
                .anyMatch( l -> l.equalsIgnoreCase("java"))) {
            System.out.println("The person is a Java developer");
        }
        else {
            System.out.println("The person is not a Java developer");
        }
    }

    @Override
    public String toString() {
        return "Developer{" +
                "languages=" + languages +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
