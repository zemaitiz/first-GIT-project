package lt.sdacademy.fundamentalscoding.practicalexcercises.hangman;

import java.util.Scanner;

public class hangman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String wordToGuess = "java";
        System.out.println(" Koks tai zodis?" + "\n" + String.valueOf(hideWordToGuess(wordToGuess)));


        System.out.println("Iveskite spejama zodi arba raide, kuria manote esant zodyje " + String.valueOf(hideWordToGuess(wordToGuess)));
        String userInput = input.nextLine();
        char[] userInputCharArray = userInput.toCharArray();
        char[] wordToGuessToCharArray = wordToGuess.toCharArray();
        int numberOfCharsInUserInput = wordToGuess.length();

       if (numberOfCharsInUserInput == 1) {
          for (int i = 0; i < userInputCharArray.length; i++) {
             if (userInputCharArray[i] == userInput.charAt(0)) {
                 wordToGuessToCharArray[i] =
             }
          }

       }
       else if (numberOfCharsInUserInput == wordToGuess.length() && userInput.equalsIgnoreCase(wordToGuess)) {
           System.out.println("Maladec! Atspejai is pirmo karto.");
       }
       else System.out.println("Nieko neivedete!");

    }


    // funkcija paverst ieskomam zodziui i zvaigzdutes
    private static char[] hideWordToGuess(String wordToGuess) {
        //susikuriam charu masyva wordToGuessCharArray
        char[] wordToGuessCharArray = wordToGuess.toCharArray();
        char x = '*';
        //char[] convertedWord = null;
        //iteruojam per visa masyva, kad paverstume kiekviena simboli i zvaigzdute

        for (int i = 0; i < wordToGuessCharArray.length; i++ ) {
           wordToGuessCharArray[i] = x;
        }
        return  wordToGuessCharArray;
    }




}
