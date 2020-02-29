package sdacademy.fundamentals.controlflow.switchcase;

import java.util.Scanner;

public class Example1 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        char direction = scanner.next().charAt(0);

        //char direction = 'e';

        switch (direction) {
            //pirmas case = if; visi kiti - else if; default - else.
            case 'n':
                System.out.println("Keliaujame siaures kryptimi!");
                break;
            case 's':
                System.out.println("Keliaujame pietu kryptimi!");
                break;
            case 'e':
                System.out.println("Keliaujame rytu kryptimi!");
                break;
            case 'w':
                System.out.println("Keliaujame vakaru kryptimi!");
                break;
            default:
                System.out.println("Keliaujame nezinoma kryptimi");
        }
    }
}
