/*
package main.sdacademy.SandBox.operator;

import java.util.Scanner;

import static main.sdacademy.SandBox.operator.Operator.messageAbout;

public class OperatorMain {

    private static final double First_Cat_Coeff = 5; //valandinis
    private static double Second_Cat_Coeff = 10;
    private static double Third_Cat_Coeff = 15;

    public static void main(String[] args) {
        Scanner numScanner = new Scanner(System.in);
        Scanner stringScanner = new Scanner(System.in);

        System.out.println("Enter your name, category and department you are working in.");

        //Operator op = new Operator(stringScanner.nextLine(),numScanner.nextInt(),stringScanner.nextLine());
        Operator op = new Operator("Tomas", 2, "Ar");

        messageAbout();
        op.showOpInfo();

        System.out.println();

        System.out.println("What do you want to do next?");
        System.out.println("[s]how salary | [i]nfo about department | [n]ew operator");
        String optionInput = stringScanner.nextLine();
//Patobulinti, kad ignorintu case.
        if (optionInput.equals("s")) {
            System.out.println(op.name + "'s monthly salary is +" + ());
        } else if (optionInput.equals("i")) {
            System.out.println("Info apie kitus dpt");
        }
    }

    private double calculateSalary(Operator operator) {
        double salary = 0;
        if (operator.category == 1) {
            salary = First_Cat_Coeff * 8 * 30;
        } else if (operator.category == 2) {
            salary = Second_Cat_Coeff * 8 * 30;
        } else if (operator.category == 3) {
            salary = Third_Cat_Coeff * 8 * 30;
        }
        return salary;
    }
}

*/
