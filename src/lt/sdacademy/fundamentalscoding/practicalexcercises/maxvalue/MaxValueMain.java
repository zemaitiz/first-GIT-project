/*

package lt.sdacademy.fundamentalscoding.practicalexcercises.maxvalue;

import java.util.Scanner;

public class MaxValueMain {
    public static void main (String[] args) {
        //Integer.parse("")
        //.split( ",")
        Scanner stringScanner = new Scanner(System.in);
        System.out.println("Iveskite skaicius, atskirdami juos kableliu");

        String numLine = stringScanner.nextLine();

        String[] numStringArray = numLine.split(",");
// 3, -2, 4
        int max = Integer.parseInt(numStringArray[0]);
        for (int i = 0; i <= numStringArray.length; i++) {
            int num = Integer.parseInt(numStringArray[i]);
            if (num > max) {
                max = num;
            }

            System.out.println(max);
        }




    }
}

*/
