package sdacademy.homework;

import java.util.Scanner;

public class Quarter {
    public static void main(String[] args) {

        Scanner numScanner = new Scanner(System.in);

        System.out.println("Iveskite x:");
        int x = numScanner.nextInt();

        System.out.println("Iveskite y:");
        int y = numScanner.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("Taskas yra 1-ame ketvirtyje");
        }
        if (x > 0 && y < 0) {
            System.out.println("Taskas yra 2-ame ketvirtyje");
        }
        if (x < 0 && y < 0) {
            System.out.println("Taskas yra 3-ame ketvirtyje");
        }
        if (x < 0 && y > 0) {
            System.out.println("Taskas yra 4-ame ketvirtyje");
        }
            if (x == 0 ) {
                System.out.println("Taskas yra ant Y asies");
            }
            if (y == 0) {
                System.out.println("Taskas yra ant X asies");
            }
        }
    }


