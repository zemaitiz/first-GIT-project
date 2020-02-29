package sdacademy.advancedfeaturescoding.letthewarbegin.fourth;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FourthMain {

    public static void main(String[] args) {


        System.out.println("Enter your name and date of birth (in format YYYY-MM-DD) separated by a comma:");
        Scanner scanner = new Scanner(System.in);
        String userDetails = scanner.nextLine();
        Parser parser = new Parser();

        Person person = parser.instantiatePerson(userDetails);
        System.out.println(person.toString());
        person.buyVehicle();
        person.buyVehicle();

        person.printVehicles();



    }
}
