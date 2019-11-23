package lt.sdacademy.homework;
import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {

        Scanner numScanner = new Scanner(System.in);

        System.out.println("Enter a number you want to check:");

        int input = numScanner.nextInt();
        int counter = 0;

        for (int i = 1; i <= input; i++) {
            if (input % i == 0) {
                counter++;
            }
        }
        if (counter == 2) {
            System.out.println(input + " is a prime number.");
        }
        else {
            System.out.println(input + " is not a prime number.");
        }
    }
}
