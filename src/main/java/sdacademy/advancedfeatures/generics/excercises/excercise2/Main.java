package sdacademy.advancedfeatures.generics.excercises.excercise2;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> stringList =  Arrays.asList("Labas", "Krabas", "Arabas");
        List<Integer> integerList = Arrays.asList(1, 2, 3);

      System.out.println(Generic.lastListItem(stringList));
      System.out.println(Generic.lastListItem(integerList));
    }
}
