package SortingSearching;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {

        int[] ar = {2, 5, 6, 78, 5, 3, 3, 6, 8, 9, 3, 97};

        // Call QuickSort for full array
        quickSort(ar, 0, ar.length - 1);

        // Print the sorted array
        System.out.println(Arrays.toString(ar));  // Should print the sorted version
    }

    // ✅ Recursive QuickSort method
    public static void quickSort(int[] ar, int start, int end) {
        if (start < end) {  // ✅ Correct condition: only sort if start < end
            int pos = partition(ar, start, end);  // Partition returns pivot final index
            quickSort(ar, start, pos - 1);        // Recursively sort left half
            quickSort(ar, pos + 1, end);          // Recursively sort right half
        }
    }

    // ✅ Partition logic with comments & example values
    public static int partition(int[] ar, int start, int end) {
        int ref = ar[start];  // Pick pivot as first element, e.g. ref = 2
        int i = start;        // i = 0
        int j = end;          // j = 11  (last index)

        // Example: ar = [2, 5, 6, 78, 5, 3, 3, 6, 8, 9, 3, 97]
        while (i < j) {
            // Move i right while ar[i] <= pivot (ref)
            // i starts at 0 → ar[0]=2 <= 2 ✔️ → i++ → i=1
            // ar[1]=5 > 2 → stop

            while (i <= end && ar[i] <= ref) {
                i++;
            }

            // Move j left while ar[j] >= pivot
            // j starts at 11 → ar[11]=97 >=2 ✔️ → j-- → j=10
            // ar[10]=3 >=2 ✔️ → j-- → j=9
            // ar[9]=9 >=2 ✔️ → j-- → j=8
            // ar[8]=8 >=2 ✔️ → j-- → j=7
            // ar[7]=6 >=2 ✔️ → j-- → j=6
            // ar[6]=3 >=2 ✔️ → j-- → j=5
            // ar[5]=3 >=2 ✔️ → j-- → j=4
            // ar[4]=5 >=2 ✔️ → j-- → j=3
            // ar[3]=78 >=2 ✔️ → j-- → j=2
            // ar[2]=6 >=2 ✔️ → j-- → j=1
            // ar[1]=5 >=2 ✔️ → j-- → j=0

            while (j > start && ar[j] >= ref) {
                j--;
            }

            // If i < j, swap (won't swap here, i=1, j=0 so i >= j)
            if (i < j) {
                swap(ar, i, j);
            }
        }

        // Final swap: place pivot (ref) at its correct spot
        // Here, pivot 2 swaps with ar[j] → ar[0] and ar[0] → no effect for this pivot
        swap(ar, start, j);

        return j;  // Return pivot's final index
    }

    // ✅ Basic swap helper
    public static void swap(int[] ar, int i, int j) {
        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }
}
