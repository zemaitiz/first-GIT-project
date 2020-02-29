package sdacademy.advancedfeatures.streams.examples;

import sdacademy.advancedfeatures.lambdaexpressions.example2.Person;
import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.List;

public class ForEachAndSortExample {

    private static final Logger logger = Logger.getLogger(ForEachAndSortExample.class);

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Michael", "Andrew", "Brandon");
        names.forEach(logger::info);

        List<Person> people = Arrays.asList(
                new Person("John", "Smith", 20),
                new Person("Sarah", "Connor", 30)
        );

        people.stream()
                .sorted((p1, p2) -> p1.getSurname().compareTo(p2.getSurname()))
                .forEach(person -> logger.info(person.getSurname()));
    }

}
