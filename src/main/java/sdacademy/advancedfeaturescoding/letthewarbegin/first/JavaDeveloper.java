package sdacademy.advancedfeaturescoding.letthewarbegin.first;

import java.util.List;

public class JavaDeveloper extends Developer {

    private  String level;
    String moto = "And I use Java to do it";

    public JavaDeveloper(String level, List<String> languages, String name, int age) {
        super(languages, name, age);
        this.level = level;
        System.out.println("This developer's level is: " + level);
    }

@Override
    public String toString() {
        return super.toString() + "I am a Java developer";
    }
}
