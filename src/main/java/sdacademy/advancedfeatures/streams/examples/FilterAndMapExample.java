package sdacademy.advancedfeatures.streams.examples;

import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class FilterAndMapExample {

    private static final Logger logger = Logger.getLogger(FilterAndMapExample.class);

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Andrew", "Brandon", "Michael");

        // Filter
        names.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(name -> logger.info(name));

        // Map
        List<Integer> nameLengths = names.stream()
                .map(name -> name.length())
                .collect(Collectors.toList());
        logger.info(nameLengths);

        OptionalDouble averageNameLengthOptional = names.stream()
                .mapToInt(name -> name.length())
                .average();
        logger.info(averageNameLengthOptional.orElse(0));
    }
}
