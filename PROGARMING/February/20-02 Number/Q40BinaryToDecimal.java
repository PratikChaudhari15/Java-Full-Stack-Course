import java.util.Scanner; // Import Scanner class for user input

class Q40BinaryToDecimal {
    public static void main(String[] args) {
        System.out.println("Enter Number: ");
        long num = new Scanner(System.in).nextInt(); // Read binary number input from user
        long temp = num; // Store original binary number for processing
        int pow = 1, dec = 0; // Initialize power of 2 and decimal result

        // Convert binary to decimal
        while (temp > 0) { 
            if ((temp % 10) == 1) // Check if the last digit is 1
                dec += pow; // Add corresponding power of 2 to the decimal result
            pow *= 2; // Move to the next power of 2 (2^n)
            temp /= 10; // Remove the last digit from binary number
        }	

        // Print the decimal equivalent
        System.out.println("Decimal: " + dec);
    }
}
