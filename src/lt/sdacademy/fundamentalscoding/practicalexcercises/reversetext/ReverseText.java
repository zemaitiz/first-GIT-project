package lt.sdacademy.fundamentalscoding.practicalexcercises.reversetext;

import java.util.Scanner;

public class ReverseText {
    public static void main (String[] args){
        Scanner textScanner = new Scanner(System.in);
        String text;
        String reversetext = "";

        System.out.println("Iveskite teksta");
        text = textScanner.nextLine();

        for (int i = text.length() - 1; i >= 0; i--) {
            reversetext += text.charAt(i); // reversetext = reverseText + text.charAt(i);
        }

        System.out.println(reversetext);



    }
}
