package sdacademy.advancedfeatures.lambdaexpressions.example2;

import java.util.function.Predicate;

public class MethodRefferenceExample {

    public static void main(String[] args) {
        Person person = new Person("Tomas", "Vestartas", 26);
        Predicate<Person> adultPersonTest = Person::isAdult;
        // auksciau ir zemiau ekvivalentu
        Predicate<Person> adultPersonTest1 = person1 -> person1.isAdult();

        adultPersonTest.test(person);
        adultPersonTest1.test(person);
        System.out.println(adultPersonTest1.test(person));
    }
}
