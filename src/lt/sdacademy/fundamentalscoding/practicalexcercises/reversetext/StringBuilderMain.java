package lt.sdacademy.fundamentalscoding.practicalexcercises.reversetext;

import java.util.Scanner;

public class StringBuilderMain {
    public static void main (String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        Scanner textScanner = new Scanner(System.in);

        System.out.println("Iveskite teksta");
        stringBuilder.append(textScanner.nextLine());

        System.out.println(stringBuilder.reverse());

        //^ identiskas
        String reverseText = stringBuilder.reverse().toString();
        System.out.println("xxx");

    }
}
