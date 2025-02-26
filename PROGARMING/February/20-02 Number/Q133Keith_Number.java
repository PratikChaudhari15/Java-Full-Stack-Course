import java.util.*;
class Q133Keith_Number
{
    //A Keith Number (also called a Repfigit Number) is a special number that appears in a Fibonacci-like sequence generated using its own digits.
    //1, 9, 7  → 1+9+7 = 17
    //9, 7, 17 → 9+7+17 = 33
    //7, 17, 33 → 7+17+33 = 57
    //17, 33, 57 → 17+33+57 = 107
    //33, 57, 107 → 33+57+107 = 197 (Matches the original number)
    public static void main(String[] args) 
    {
        System.out.println("Enter Number : ");
        int n = new Scanner(System.in).nextInt(); // Read user input
        int temp = n, len = 0, sum = 0, dup = n; // Initialize variables
        boolean flag = false; // Flag to check if the number is Keith
        int[] arr; // Array to store digits of the number
        
        // Count the number of digits in 'n'
        while (temp > 0) 
        {
            len++; // Increment length for each digit
            temp /= 10; // Remove last digit
        }
        arr = new int[len]; // Create an array of size equal to the number of digits

        System.out.println(arr.length); // Print length of the number (number of digits)
        // Store digits of 'n' into the array (from rightmost to leftmost)
        for (int i = arr.length - 1; i >= 0; i--) 
        {
            arr[i] = n % 10; // Extract last digit
            n /= 10; // Remove last digit
        }
        // Generate the sequence until the sum reaches or exceeds the original number
        while (sum <= dup) 
        {
            sum = 0; // Reset sum in every iteration
            // Calculate sum of previous 'len' terms
            for (int i = 0; i < arr.length; i++) 
            {
                sum += arr[i];  
            }
            // Shift array left, discarding first element and adding new sum at the end
            for (int i = 1; i < arr.length; i++) 
            {
                arr[i - 1] = arr[i]; // Shift left
            }

            arr[len - 1] = sum; // Store the new term at the last position
            
            // Check if the sum matches the original number
            if (dup == sum) 
            {
                flag = true; // Mark as Keith number
                break; // Exit loop early if condition is met
            }
        }
        // Display result based on the flag value
        System.out.println((flag) ? ("Keith Number : " + dup) : ("Not A Keith Number : " + dup));
    }
}
