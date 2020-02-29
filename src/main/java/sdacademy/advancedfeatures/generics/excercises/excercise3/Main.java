package sdacademy.advancedfeatures.generics.excercises.excercise3;

import org.apache.log4j.Logger;

public class Main {

    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {

        logger.error("Dzien dobry");

        TwoItems<String> twoItemsString = new TwoItems("baba", "yaga");
        TwoItems<Integer> twoItemsInt = new TwoItems(1, 2);


        System.out.println(twoItemsString.toString() + "\n" + twoItemsInt.toString() );
    }
}
