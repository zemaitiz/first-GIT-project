package sdacademy.advancedfeatures.interfaces.excercises;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class RichestMain {

    public static void main(String[] args) {
        List<World> objList = Arrays.asList(
                new Country("Lietuva", BigDecimal.valueOf(5000000)),
                new Country("USA", BigDecimal.valueOf(1000000000)),
                new Person("Tomas", BigDecimal.valueOf(1500)),
                new Person("Karbauskis", BigDecimal.valueOf(15000000))
        );

/*
        BigDecimal amount = objList.get(0).amount;
        String name = objList.get(0).name;

        Map<String, BigDecimal> richest = new HashMap<>();

        for (int i = 0; i < objList.size() - 1; i++) {
            if (objList.get(i).findRicher(objList.get(i + 1).amount)) {
                amount = objList.get(i + 1).amount;
                name = objList.get(i + 1).name;
            }
        }
*/

        World richest = objList.get(0);

        for (int i = 0; i < objList.size() - 1; i++) {
            if (richest.findRicher(objList.get(i + 1).amount)) {
            }
            richest = objList.get(i + 1);
        }

        System.out.println(richest.name + richest.amount );

    }
}
