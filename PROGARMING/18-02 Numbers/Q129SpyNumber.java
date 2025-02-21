import java.util.Scanner;

class Q129SpyNumber {
    // A Spy Number is a number where:
    // - The sum of its digits is equal to the product of its digits.
    // Example: 123 → 1+2+3 = 6, 1×2×3 = 6 → Spy Number

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object
        System.out.print("Enter a Number: "); // Prompt user input

        int num = sc.nextInt(); // Read input number
        int sum = 0; // To store sum of digits
        int mul = 1; // Initialize to 1 for multiplication
        int rem;
        int originalNum = num; // Store original number for output

        while (num > 0) { // Loop runs while num is greater than 0
            rem = num % 10; // Extract last digit
            sum = sum + rem; // Add digit to sum
            mul = mul * rem; // Multiply digit to mul
            num /= 10; // Remove last digit
        }
        // Check if sum and product are equal
        if (sum == mul) {
            System.out.println(originalNum + " is a Spy Number.");    
        } else {
            System.out.println(originalNum + " is NOT a Spy Number.");
        }

        sc.close(); // Close Scanner
    }
}
