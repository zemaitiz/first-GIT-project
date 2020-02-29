package sdacademy.fundamentalscoding.practicalexcercises.averagecalculator;

import java.util.Arrays;
import java.util.List;

public class AverageCalculatorMain {
    public static void main (String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 32, 4, 5, 1);

        int sum = 0;
        double average = 0;

        for (Integer number : integers) {
            sum += number;
        }
        average = (double) sum / integers.size();
        System.out.printf("Vidurkis: %.2f ", average);
    }
}
