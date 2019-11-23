package lt.sdacademy.fundamentalscoding.practicalexcercises.factorial;

import java.util.Scanner;

public class FactorialMain {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Iveskite skaiciu:");

        int num = input.nextInt();
        int numFactorial = 1;

        for (int i = 1; i >= num; i++) {
          numFactorial*= i;
        }
        System.out.println(num + " faktorialas yra " + numFactorial);

    }
}
