package SortingSearching;

import java.util.Arrays;

public class SortingInSameArray
{
    public static void main(String[] args) {
        // Your original input: two sorted halves in one array
        int[] arr = {3, 5, 9, 15, 18, 50, 8, 12, 17, 19, 21, 25};

        // Print merged result
        System.out.println(Arrays.toString(mergeSameArray(arr)));
    }

    public static int[] mergeSameArray(int[] a) {
        // ans[] stores the merged output
        int[] ans = new int[a.length];

        // i -> pointer for left half (starts at 0)
        // j -> pointer for right half (starts at middle)
        // k -> pointer for ans[]
        int i = 0, j = a.length / 2, k = 0;

        // Loop while BOTH parts have elements left
        while (i < a.length / 2 && j < a.length) {
            // If left element smaller, take from left
            if (a[i] <= a[j]) {
                ans[k++] = a[i++]; // Take a[i], move i and k
            }
            // If right element smaller, take from right
            else if (a[i] > a[j]) {
                ans[k++] = a[j++]; // Take a[j], move j and k
            }
        }

        // If any elements left in left half, copy them
        while (i < a.length / 2) {
            ans[k++] = a[i++];
        }

        // If any elements left in right half, copy them
        while (j < a.length) {
            ans[k++] = a[j++];
        }

        return ans; // Return final merged array
    }
}
