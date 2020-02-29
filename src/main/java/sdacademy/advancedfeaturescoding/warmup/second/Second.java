package sdacademy.advancedfeaturescoding.warmup.second;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Second {

    public static void main(String[] args) {

        Random random = new Random();
        List<Integer> integerList = new ArrayList<>();
        integerList.add(random.nextInt(10));
        integerList.add(random.nextInt(10));
        integerList.add(random.nextInt(10));
        integerList.add(random.nextInt(10));
        integerList.add(random.nextInt(10));
        integerList.add(random.nextInt(10));

        System.out.println(integerList);


        System.out.println(integerList.stream()
                .map(i -> i % 2 == 0 ? "e" + i : "o" + i)
                .collect(Collectors.joining(",")));
    }
}
