import java.util.Scanner;  // Import Scanner class for user input

class FactorialEvenOddDigMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object for input
        System.out.print("\nEnter Number : ");
        int num = sc.nextInt();  // Read user input

        int sumEven = 0; // Variable to store sum of factorials of even digits
        int sumodd = 0;  // Variable to store sum of factorials of odd digits
        int sum = 0;     // Variable to store total sum of all factorials

        // Loop to extract each digit and process it
        while (num > 0) {
            int rem = num % 10; // Extract the last digit of num
            num /= 10;          // Remove the last digit
            
            int fact = 1;  // Initialize factorial to 1 for each digit

            // Check if digit is even
            if (rem % 2 == 0) {
                // Calculate factorial of even digit
                for (int i = 1; i <= rem; i++) {
                    fact *= i;  // fact = fact * i
                }
                sumEven = sumEven + fact;  // Add factorial to sumEven
            }

            // Check if digit is odd
            if (rem % 2 != 0) {
                // Calculate factorial of odd digit
                for (int j = 1; j <= rem; j++) {
                    fact *= j;  // fact = fact * j
                }
                sumodd = sumodd + fact;  // Add factorial to sumodd
            }

            sum = sum + fact;  // Add factorial to total sum

            // Print the factorial of the current digit
            System.out.println("Factorial Of " + rem + " Is " + fact);
        }

        // Print the final results
        System.out.println("Sum Of Factorials : " + sum);
        System.out.println("Sum Of Even Factorials : " + sumEven);
        System.out.println("Sum Of Odd Factorials : " + sumodd);
    }
}
