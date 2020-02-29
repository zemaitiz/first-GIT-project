package sdacademy.advancedfeatures.exceptions.excercise;

import java.util.Scanner;

public class Excercise {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");

        try {
            int numInt = Integer.parseInt(input.nextLine());
            System.out.println("Entered: " + numInt);
        } catch (NumberFormatException intException) {
            try {
                double numDouble = Double.parseDouble(input.nextLine());
                System.out.println("Entered: " + numDouble);
            } catch (NumberFormatException doubleException) {
                System.out.println("That's not a number!");
            }
        }
    }
}


