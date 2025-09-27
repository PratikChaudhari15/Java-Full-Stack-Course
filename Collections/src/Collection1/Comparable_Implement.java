package Collection1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This class demonstrates several useful utility methods from java.util.Collections.
 * I have NOT changed your logic — only added comments explaining what each line does,
 * behavior notes and complexity/important remarks.
 */
public class Comparable_Implement {
    public static void main(String[] args) {
        // Create an ArrayList of Integer (use generics to avoid casts)
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(10);   // append 10 (amortized O(1))
        a.add(12);
        a.add(76);
        a.add(10);
        a.add(43);
        a.add(0);
        a.add(0);

        // Sort the list in natural ascending order (uses TimSort, O(n log n))
        Collections.sort(a);

        // Print sorted list
        System.out.println(a);

        // Binary search for 76 (list MUST be sorted for binarySearch to work properly)
        // Returns index of an occurrence of 76 (if duplicates exist, any matching index may be returned)
        // If not found, returns (-(insertion point) - 1)
        System.out.println(Collections.binarySearch(a, 76));

        // Create a shallow copy of 'a' by using the ArrayList copy-constructor
        ArrayList<Integer> temp = new ArrayList<Integer>(a);

        System.out.println(temp);

        // disjoint(a, temp) returns true if the two collections have NO elements in common.
        // Here temp is a copy of a, so they share elements → disjoint returns false.
        System.out.println(Collections.disjoint(a, temp));

        // max / min - find maximum and minimum elements (natural order)
        System.out.println(Collections.max(a)); // O(n)
        System.out.println(Collections.min(a)); // O(n)

        // original list still intact
        System.out.println(a);

        // Create an immutable List containing 10 copies of -1.
        // Note: the returned list from nCopies is immutable (cannot add/remove), but you can read its elements.
        List<Integer> temp2 = Collections.nCopies(10, -1);
        System.out.println(temp2);

        // replaceAll(list, oldVal, newVal) - replace every occurrence of 0 with -1 in the list
        // This mutates list 'a' in-place. Complexity O(n).
        Collections.replaceAll(a, 0, -1);
        System.out.println(a);

        // reverse the list in-place (O(n))
        Collections.reverse(a);
        System.out.println(a);

        // rotate the list by 3 positions to the right.
        // Example: rotate([1,2,3,4,5], 2) -> [4,5,1,2,3]
        // rotate is O(n)
        Collections.rotate(a, 3);
        System.out.println(a);

        // shuffle the list randomly. Call once is enough to randomize.
        // Calling shuffle twice is redundant (both calls randomize the order).
        Collections.shuffle(a);
        Collections.shuffle(a);

        System.out.println(a);

        // swap elements at index 3 and 5 (0-based). Throws IndexOutOfBoundsException if indices invalid.
        Collections.swap(a, 3, 5);
        System.out.println(a);
    }
}
