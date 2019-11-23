package lt.sdacademy.fundamentals.arrays;

import java.util.Arrays;
import java.util.List;

public class Example3 {
    public static void main (String[] args) {

        int[] arrayOfInts = {10, 15, 20, 25, 30};
        System.out.println(arrayOfInts[0]); //prints 10
        System.out.println(arrayOfInts[2]); //prints 10
        System.out.println(arrayOfInts[4]); //prints 10

        //Isspausdins 10 15 20 25 30
        for (int i = 0; i < arrayOfInts.length; i++) {
            System.out.println(arrayOfInts[i] + " ");
        }
        System.out.println(); //Spausdinama tuscia eilute

        //Isspausdins 10 15 20 25 30
        for(int i : arrayOfInts) {
            System.out.println(i +" ");

            //Cia sake nerasyt, bet uzsirasau, veliau mokysimes
            System.out.println();
            List<Integer> integerList = Arrays.asList(10, 15, 20, 25, 30);
            integerList.forEach(number -> System.out.println(number + " "));

        }
    }
}
