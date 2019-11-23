package lt.sdacademy.fundamentals.controlflow.ifelse;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner ageScanner = new Scanner(System.in);
        System.out.println("Ivesk savo amziu");
        int age = ageScanner.nextInt();

        //int age = 150;
        if (age < 18) {
            System.out.println("Tu paauglys!");
        }
        else if (age > 100) {
            System.out.println("Tu labai senas!");
        }
        else {
            System.out.println("Tu suauges!");
        }
    }
}

