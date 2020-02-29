package sdacademy.advancedfeatures.algorithmsanddatastructures.datastructures.sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 5, 0, 3, 4, 6};
        int[] sortedArr = sort(arr);
        for (int t : sortedArr) {
            System.out.println(t);
        }

    }

    private static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {

                int element = arr[j];
                if (arr[i] > arr[j]) {
                    arr[j] = arr[j] + 1;
                    arr[j + 1] = element;
                }
            }
        }
        return arr;
    }
}
