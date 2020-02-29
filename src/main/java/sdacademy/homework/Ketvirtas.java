package sdacademy.homework;

import java.util.Scanner;

public class Ketvirtas {

    public static void main(String[] args) {
// Isivedam Scanner objekta (?) numScanner, kuris System.in pagalba duos ivesti skaiciu.
        Scanner input = new Scanner(System.in);

        System.out.println("Iveskite bet koki skaiciu:");
        // Ivest skaiciui turim sukurti nauja kintamaji, duoti jam varda. Kintamaji gausime (jis bus ivestas) per numScanner.next*kintamojo_tipas()*
        int x = input.nextInt();
        int counter = 0;

        for (int i = 1; i <= 100; i++) {

            /*double dalmuo = i/x;
          if (dalmuo == (int)dalmuo) {
              counter++;
          }*/

            if (i % x == 0) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
