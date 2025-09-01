package SortingSearching;
import java.util.Arrays;
public class MergeSort {

    public static void main(String[] args) {
        // ✅ Two sorted arrays for merging
        // For example:
        //   a = [5, 15, 20, 55, 60]
        //   b = [2, 3, 8, 12, 18, 25, 32, 50, 63]
        int[] a = {5, 15, 20, 55, 60};
        int[] b = {2, 3, 8, 12, 18, 25, 32, 50, 63};

        // ✅ Call the merge method and print the merged array
        System.out.println(Arrays.toString(merge(a, b)));
    }

    // ✅ Method to merge two sorted arrays into one sorted array
    public static int[] merge(int[] a, int[] b) {

        // ✅ Result array size = total length of a[] + b[]
        int[] ans = new int[a.length + b.length];

        // ✅ Pointers:
        int i = 0; // pointer for array a[]
        int j = 0; // pointer for array b[]
        int k = 0; // pointer for ans[]

        // ✅ Example at start:
        //   i = 0 (points to a[0] = 5)
        //   j = 0 (points to b[0] = 2)

        // ✅ Main loop: run until either a[] or b[] is fully traversed
        while (i < a.length && j < b.length) {
            // Compare a[i] and b[j]
            if (a[i] <= b[j]) {
                ans[k++] = a[i++]; // If a[i] is smaller, take it and move i
                // Example: a[0] = 5 vs b[0] = 2
                // Since 5 > 2, so else block runs first
            } else {
                ans[k++] = b[j++]; // If b[j] is smaller, take it and move j
                // For first step:
                //   a[0] = 5, b[0] = 2 → take 2, so ans[0] = 2
                //   j++ → j = 1, next b[1] = 3
            }
            // Next step:
            //   i = 0 (5), j = 1 (3)
            //   5 > 3 → take 3 → ans[1] = 3 → j++
            // Next:
            //   i = 0 (5), j = 2 (8)
            //   5 < 8 → take 5 → ans[2] = 5 → i++
        }

        // ✅ After main loop, one array might have leftover elements.
        // ✅ These leftover elements are directly copied — because they are already sorted!

        // ✅ Copy leftover elements from a[], if any
        while (i < a.length) {
            ans[k++] = a[i++];
            // For example, if b[] finishes first:
            // Remaining a[] = [55, 60] → they go to ans[] directly.
        }

        // ✅ Copy leftover elements from b[], if any
        while (j < b.length) {
            ans[k++] = b[j++];
            // If a[] finishes first, leftover b[] = [50, 63], etc.
        }

        // ✅ Return the merged sorted array
        return ans;
    }
}
