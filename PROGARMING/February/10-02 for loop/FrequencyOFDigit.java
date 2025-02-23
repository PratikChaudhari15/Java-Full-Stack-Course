import java.util.Scanner;

class FrequencyOFDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object for input
        System.out.println("Enter Number: ");
        long num = sc.nextLong(); // Read input as long to handle large numbers
        System.out.println(num); // Print the entered number

        // Loop to check frequency of each digit from 0 to 9
        for (int i = 0; i <= 9; i++) {
            int cnt = 0; // Counter to count occurrences of digit 'i'

            // Loop through each digit of 'num'
            for (long j = num; j > 0; j /= 10) {
                long rem = j % 10; // Extract last digit
                if (i == rem) { // Check if it matches the current digit 'i'
                    cnt++; // Increment count if match found
                }
            }

            // Print the frequency of the digit if it appears in the number
            if (cnt != 0) {
                System.out.println(i + " : " + cnt);
            }
        }

        sc.close(); // Close Scanner to prevent memory leaks
    }
}
