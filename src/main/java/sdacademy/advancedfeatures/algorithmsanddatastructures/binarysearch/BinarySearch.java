package sdacademy.advancedfeatures.algorithmsanddatastructures.binarysearch;

public class BinarySearch {
    public static void main(String[] args) {
        //cia nesurusiuotas
        int[] arrayOfInts = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        // Arrays.sort(arrayOfInts);
        // ieskoma skaiciaus -1 pozicija
        int x = -1;
        int left = 0;
        int right = arrayOfInts.length - 1;
        int middle;

        boolean found = false;

        while (left <= right) {
            middle = (left + right) / 2;
            if (x == arrayOfInts[middle]) {
                System.out.println("X is at " + middle);
            }
            if (x < arrayOfInts[middle]) {
                right = middle;
                middle = (left + right) / 2;



            }
        }

    }
}
