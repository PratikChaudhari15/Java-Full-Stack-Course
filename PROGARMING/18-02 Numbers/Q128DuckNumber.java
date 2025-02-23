import java.util.Scanner;
class Q128DuckNumber {
    // A Duck Number is a number that:
    // - Contains at least one '0' in its digits
    // - Does NOT start with '0' (otherwise, it would be an octal number)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object
        System.out.print("Enter a Number: "); // Prompt user for input
        
        String num = sc.next(); // Read input as a string

        // If the number starts with '0', it is NOT a Duck Number
        if (num.charAt(0) == '0') {
            System.out.println(num + " : Not a Duck Number");
        } else {
            // Check if the number contains '0' anywhere (excluding first digit)
            if (num.contains("0")) { // Corrected method call
                System.out.println(num + " is a Duck Number");    
            } else {
                System.out.println(num + " is not a Duck Number");
            }
        }

        sc.close(); // Close scanner to prevent resource leak
    }
}
