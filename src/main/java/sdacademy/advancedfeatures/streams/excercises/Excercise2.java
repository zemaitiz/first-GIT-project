package sdacademy.advancedfeatures.streams.excercises;

/*2. Su esamu žodžių sąrašu atlikite užduotis:
        Sujunkite žodžius į vieną naudodami reduce funkciją;
        Naudodami pradinį žodžių sąrašą, paverskite juos didžiosiomis raidėmis su map funkcija ir vėl sujunkite į vieną žodį su reduce;
        Naudodami pradinį žodžių sąrašą, sujunkite į vientisą tekstą, kiekvieną žodį atskyrę ženklu , (tekstas negali prasidėti ar baigtis nurodytu ženklu);
        Naudodami pradinį žodžių sąrašą, išspausdinkite tuos, kurie turi raidę o. [Rytas, Lova, Durys, Automobilis, Katinas]*/

import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Excercise2 {

    private static final Logger logger = Logger.getLogger(Excercise2.class);

    public static void main(String[] args) {
        List<String> words = Arrays.asList("Rytas", "Lova", "Durys", "Automobilis", "Katinas");

        String wordsIntoOneWord = words.stream()
                .reduce("",
                        (currentValue, element) -> currentValue + element);
        logger.info(wordsIntoOneWord);

        String wordsToUpToOne = words.stream()
                .map(String::toUpperCase)
                .reduce("",
                        (currentValue, element) -> currentValue + element);
        logger.info(wordsToUpToOne);

        String wordsToOneWitchCommas = words.stream()
                .reduce("",
                        (currentValue, element) -> (currentValue.isEmpty() ? "" : currentValue + ",") + element);
        logger.info(wordsToOneWitchCommas);

        words.stream()
                .filter(word -> word.contains("o"))
                .forEach(logger::info);


    }
}
