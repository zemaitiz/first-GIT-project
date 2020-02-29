package sdacademy.advancedfeatures.streams.excercises;

/*. Skaičiai:
        Prieš atliekant užduotis susigeneruokite ilgą atsitiktinių skaičių masyvą, sudarytą tik iš 0 ir 1;
        Apskaičiuokite viso masyvo skaitmenų sumą ir ištraukite šaknį.*/

import org.apache.log4j.Logger;

import java.util.Random;

public class Excercise3 {

    private static final Logger logger = Logger.getLogger(Excercise3.class);

    public static void main(String[] args) {
        int random = new Random().ints(150, 0, 2).sum();
        logger.info(random);
        Math.sqrt(random);
    }
}
