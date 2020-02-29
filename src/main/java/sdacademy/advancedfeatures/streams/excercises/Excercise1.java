package sdacademy.advancedfeatures.streams.excercises;

import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/*1. Su esamu vardų sąrašu atlikite užduotis:
        Palikite tuos, kurie trumpesni, nei 6 simbolių;
        Palikite tuos, kurie savyje turi raidę e;
        Atspausdinti esamus vardus didžiosiomis raidėmis;
        Jei yra keli variantai, iš surūšiuoto sąrašo pasirinkite paskutinį vardą. [Romualdas, Agnė, Elena, Angelė, Laurynas, Karolis, Bronius, Ignė, Meda]
*/
public class Excercise1 {

    private static final Logger logger = Logger.getLogger(Excercise1.class);

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Romualdas", "Agnė", "Elena", "Angelė", "Laurynas", "Karolis", "Bronius", "Ignė", "Meda");


        Optional<String> lastNameAfterTweaking = names.stream()
                .filter(name -> name.length() < 6)
                .filter(name -> name.contains("e"))
                .map(String::toUpperCase)
                .peek(logger::info)
                .sorted(Comparator.reverseOrder())
                .findFirst();

        System.out.println(lastNameAfterTweaking);

        names.stream()
                .filter(name -> name.length() < 6)
                .filter(name -> name.contains("e"))
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .peek(logger::info)
                .peek(System.out::println)
                .findFirst();




    }
}
