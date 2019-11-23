package lt.sdacademy.homework;

import java.util.Scanner;

public class Penktas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Boolean convert = true;

        //while (convert) {

            System.out.print("Iveskite savaites dienos pavadinima: ");
            String dayName = input.nextLine().toLowerCase();

            switch (dayName) {
                case "pirmadienis"/* || "Pirmadienis".toLowerCase().equals("pirmadienis")*/:
                    System.out.println("1");
                    break;
                case "antradienis":
                    System.out.println("2");
                    break;
                case "treciadienis":
                    System.out.println("3");
                    break;
                case "ketvirtadienis":
                    System.out.println("4");
                    break;
                case "penktadienis":
                    System.out.println("5");
                    break;
                case "sestadienis":
                    System.out.println("6");
                    break;
                case "sekmadienis":
                    System.out.println("7");
                    break;

            }
        //}
        /*System.out.println("Ar norite testi? TAIP : NE");
        String answer = input.nextLine();

        if (answer = "NE" || answer.toLowerCase().equals("ne")) {
            convert = false;
        }*/
    }
}
