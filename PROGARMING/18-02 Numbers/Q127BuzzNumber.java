import java.util.Scanner; // Import Scanner class for user input
class Q127BuzzNumber {
    // A Buzz Number is a number that:
    // 1. Is divisible by 7 OR
    // 2. Ends with the digit 7 (e.g., 7, 17, 27, etc.)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object for user input
        System.out.print("Enter a Number: "); // Prompt the user to enter a number
        
        int num = sc.nextInt(); // Read the input number

        // Check if the number is a Buzz Number
        if (num % 7 == 0 || num % 10 == 7) { 
            // Condition 1: Check if the number is divisible by 7 (num % 7 == 0)
            // Condition 2: Check if the last digit is 7 (num % 10 == 7)
            System.out.println(num + " is a Buzz Number"); 
        } else {
            System.out.println(num + " is NOT a Buzz Number");
        }
    }
}
