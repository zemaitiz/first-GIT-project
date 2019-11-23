/*
package lt.sdacademy.fundamentalscoding.practicalexcercises.homework.dog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DogMain {


    public static void main(String[] args) {
        List<Dog> dogList = new ArrayList<>(); //susikuriam lista, kuris talpins info apie obj
        //for ciklas tam, kad sukurtume norima objektu kieki?
        for (int i = 0; i < 3; i++) {
            dogList.add(DogMain.buildDog()); //kreipiames i objekta dogList ir naudojam .add, nurodom funkcija, kuri paduos obj fieldus
        }

        */
/*for (int j = 0; j < dogList.size(); j++)
        {
            System.out.println(dogList.get(j).getName());

        }*//*


        for (Dog j : dogList) {
            System.out.println(j.getName());
        }
        System.out.println(findAvgAge(dogList));

    }

    private static Dog buildDog() {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Enter dog's name: ");
        String name = inputScanner.nextLine();

        System.out.println("Enter dog's age: ");
        int age = inputScanner.nextInt();

        System.out.println("Enter dog's color: ");
        String color = inputScanner.nextLine();

        return new Dog(name, age, color);

    }

    public static double findAvgAge(List<Dog> dogList) {
        int totalDogAge = 0;
        for (int d = 0; d < dogList.size(); d++) {
            totalDogAge = +dogList.get(d).getAge();
            return totalDogAge / dogList.size();
        }

      */
/* for (Dog dogs:dogList) {
           int sumAge += dogs.getAge();
           return sumAge / dogList.size();
       }
    }*//*

    }
}
*/
