package sdacademy.advancedfeaturescoding.letthewarbegin.fifth;

import java.util.HashMap;
import java.util.Scanner;

public class FifthMain {

    public static void main(String[] args) {

        boolean notFinished = true;
        HashMap<String, String> hashMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (notFinished) {
            System.out.println("Enter country");
            String country = scanner.nextLine();
            System.out.println("Enter city");
            String city = scanner.nextLine();
            hashMap.put(country, city);
            System.out.println("Are you finished? y:n");
            String answer = scanner.nextLine();

            if (answer.equalsIgnoreCase("y")) {
                notFinished = false;
            }
        }
        System.out.println(hashMap);
    }
}
