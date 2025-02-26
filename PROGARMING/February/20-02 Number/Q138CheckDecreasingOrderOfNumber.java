import java.util.Scanner; // Import Scanner class for user input
class Q138CheckDecreasingOrderOfNumber {
    public static void main(String[] args) {
        System.out.println("Enter Number: ");
        int num = new Scanner(System.in).nextInt(); // Read input number from user
        int flag = 1; // Flag variable to track if the number is in decreasing order

        // Loop through each digit of the number from right to left
        while (num >= 10) { // Continue until the number has at least two digits
            // Compare the last digit (num % 10) with the second-last digit ((num/10) % 10)
            if ((num % 10) > ((num / 10) % 10)) { // If current digit is greater than the previous one
                flag = 0; // Mark as not in decreasing order
                break; // Exit loop early since the condition is violated
            }
            num /= 10; // Remove last digit to check the next pair
        }
        // Print the result based on the flag value
        if (flag == 0) {
            System.out.println("No"); // Number is NOT in decreasing order
        } else {
            System.out.println("Yes"); // Number is in decreasing order
        }
    }
}
