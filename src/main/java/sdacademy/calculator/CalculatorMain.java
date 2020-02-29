package sdacademy.calculator;

import java.util.Scanner;

public class CalculatorMain {

    public static void main(String[] args) {

        Scanner continueScanner = new Scanner(System.in);
        boolean calculate = true;
        double result = 0;

        while (calculate) {

            double firstNum = getNum("Iveskite pirma skaiciu:");
            double secondNum = getNum("Iveskite antra skaiciu:");
            String action = getAction("Iveskite veiksma:");

            /*System.out.println("Ivesk antra skaiciu");
            int secondNum = numberScanner.nextInt();*//*

            System.out.println("Koki veiksma norite atlikti: + - * /");
            String action = actionScanner.nextLine();
*/
            result = getResult(action, firstNum, secondNum); //funkcija
            System.out.println("Atsakymas: " + result);





        /*if (action.equals("+")) {
                System.out.println(firstNum + secondNum);
            }

            else if (action.equals("-")) {
                System.out.println(firstNum - secondNum);
            }
            else if (action.equals( "*")) {
                System.out.println(firstNum * secondNum);
            }
            else if (action.equals( "/")) {
                System.out.println(firstNum / secondNum);
            }
            else {
                System.out.println("Nezinomas veiksmas");
            }*/

            System.out.println("Ar norite skaiciuoti toliau? TAIP : NE");
            String answer = continueScanner.nextLine();

            if (answer.equalsIgnoreCase("NE")) {
                calculate = false;
            }
        }
    }

    private static double getResult(String action, double num1, double num2) {
        switch (action) {
            case ("+"): {
                return num1 + num2;
            }
            case ("-"): {
                return num1 - num2;
            }
            case ("*"): {
                return num1 * num2;
            }
            case ("/"): {
                return num1 / num2;
            }
            default: {
                System.out.println("Veiksmas nerastas");
                return 0;
            }
        }
    }

    private static double getNum(String message) {
        Scanner numberScanner = new Scanner(System.in);
        System.out.println(message);
        double number = numberScanner.nextDouble();
        return number;
        // mandriau butu return numberScanner.nextDouble();
    }

    private static String getAction(String message) {
        Scanner actionScanner = new Scanner(System.in);
        System.out.println(message);
        String action = actionScanner.nextLine();
        return action;
    }
}

