package sdacademy.advancedfeatures.streams.examples;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindExample {

    private static final Logger logger = Logger.getLogger(FindExample.class);

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Andrew", "Brandon", "Michael");

        List<String> namesCopy1 = new ArrayList<>(names);
        List<String> namesCopy2 = new ArrayList<>(names
                .stream()
                .collect(Collectors.toList())
        );

        String firstName1 = names.stream()
                .findFirst()
                .orElse("Pasol nx");

        Optional<String> anyName = names.stream().findAny();
        logger.info(String.format(("First name: %s"), anyName.orElse("List was empty, nx!")));

    }
}
