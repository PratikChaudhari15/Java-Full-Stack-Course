package Exception;
import java.util.InputMismatchException;  // To handle wrong input type (like string instead of int)
import java.util.Scanner;  // To take input from user

public class MultipleCatchExa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Scanner object for user input

        int[] numbers = {10, 20, 30};  // Array of integers

        try {
            // Taking numerator input
            System.out.print("Enter numerator: ");
            int num = sc.nextInt();

            // Taking denominator input
            System.out.print("Enter denominator: ");
            int den = sc.nextInt();

            // Division operation (this may throw ArithmeticException if denominator is 0)
            int result = num / den;
            System.out.println("Result: " + result);

            // Asking for array index to access
            System.out.print("Enter index to access (0-2): ");
            int index = sc.nextInt();

            // Accessing array element (this may throw ArrayIndexOutOfBoundsException)
            System.out.println("Value at index " + index + ": " + numbers[index]);

        }

        // Handles division by zero
        catch (ArithmeticException e) {
            System.out.println("❌ Error: Division by zero is not allowed.");
        }

        // Handles invalid array index
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("❌ Error: Invalid array index.");
        }

        // Handles non-integer input (like string or float)
        catch (InputMismatchException e) {
            System.out.println("❌ Error: Please enter only integer values.");
        }

        // Catches any other unexpected exceptions
        catch (Exception e) {
            System.out.println("❌ Something went wrong: " + e);
        }

        // This block always executes whether exception occurs or not
        finally {
            System.out.println("✅ Program ended.");
            sc.close();  // Always close resources
        }
    }
}
