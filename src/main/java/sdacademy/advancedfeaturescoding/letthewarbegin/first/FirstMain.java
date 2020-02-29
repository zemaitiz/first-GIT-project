package sdacademy.advancedfeaturescoding.letthewarbegin.first;

import java.util.Arrays;

public class FirstMain {

    public static void main(String[] args) {

        JavaDeveloper javaDeveloper = new JavaDeveloper("senior", Arrays.asList("Java", "Python", "PHP"), "Tomas", 26);
        System.out.println(javaDeveloper.toString());
    }
}