package sdacademy.advancedfeatures.optional;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {
        Optional<String> stringOptional = Optional.of("Hello");
        Optional<String> stringOptional1 = Optional.of("World");
        Optional<String> stringOptional2 = Optional.ofNullable(null);

        System.out.println(stringOptional.isPresent());
        stringOptional1.ifPresent(System.out::println);
        stringOptional.ifPresent(t -> System.out.println(t));

        String value = stringOptional2.orElse("Hello World!");
        System.out.println(value);
    }
}
