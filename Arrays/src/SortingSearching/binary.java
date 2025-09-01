package SortingSearching;
import java.util.Arrays;
public class binary {
    public static void main(String[] args) {

        // ✅ Example sorted array (binary search works only on sorted data)
        int[] a = {15, 18, 20, 25, 26, 29, 30};

        // ✅ Element to search for
        int ele = 18;

        // ✅ Call binary search method
        binarySearch(a, ele);
    }

    // ✅ Method to perform binary search
    public static void binarySearch(int[] ar, int ele) {

        int start = 0;              // ✅ Start index of the search window
        int end = ar.length - 1;    // ✅ End index of the search window
        int mid = (start + end) / 2; // ✅ Calculate middle index

        boolean flag = false;       // ✅ Flag to track if element is found

        // ✅ Repeat until search window is valid
        while (start <= end) {
            if (ar[mid] == ele) {
                // ✅ If mid element matches the target, print index and stop
                System.out.println("Element " + ele + " is found at index " + mid);
                flag = true; // ✅ Mark found
                break;       // ✅ Exit loop
            } else if (ele > ar[mid]) {
                // ✅ If target is greater, search right half
                start = mid + 1;
            } else if(ele < ar[mid]) {
                // ✅ If target is smaller, search left half
                end = mid - 1;
            }

            // ✅ Recalculate mid index after changing range
            mid = (start + end) / 2;
        }

        // ✅ If flag is still false after loop, element was not found
        if (!flag) {
            System.out.println("Element not found");
        }
    }
}
