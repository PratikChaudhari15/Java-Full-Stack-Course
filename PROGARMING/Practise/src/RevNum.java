public class RevNum {
    public static void main(String[] args) {
        int num = 12355;  // Original number
        int dup = num;  // Copy of original number, just in case
        int rev = 0;    // This will store the reversed number

        // The current logic only works for exactly 3 digits because you do it manually.
        // To reverse ANY number, use a loop!

        while (num != 0) {
            int rem = num % 10;   // Get last digit
            rev = rev * 10 + rem; // Add it to reversed number
            num = num / 10;       // Remove last digit from num
        }

        System.out.println("Original number: " + dup);
        System.out.println("Reversed number: " + rev);
    }
}
