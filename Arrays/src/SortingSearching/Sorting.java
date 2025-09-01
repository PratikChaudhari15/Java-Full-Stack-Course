package SortingSearching;

import java.util.Arrays; // Needed for Arrays.toString()

public class Sorting {
    public static void main(String[] args) {
        int[] a = {100, 20, 3, 1, -8}; // Sample array

        BubbleSort(a); // Call Bubble Sort

        // Print sorted array
        System.out.println(Arrays.toString(a));
    }

    // Bubble Sort method to sort an array in ascending order
    public static void BubbleSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
}