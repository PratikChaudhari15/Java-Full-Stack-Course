package Exception;

import java.util.Scanner;

public class E1
{
    public static void main(String[] args) {

        // Scanner is used to take input from the user
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First number:");
        int num = sc.nextInt();  // taking numerator

        System.out.println("Enter the Second number:");
        int den = sc.nextInt();  // taking denominator

        try {
            // Try block contains code that might throw an exception
            int ans = num / den;  // division operation (may throw ArithmeticException if den == 0)
            System.out.println("Result: " + ans);
        }
        catch (ArithmeticException ref) {
            // Catch block handles the specific exception
            System.out.println("Don't divide by zero!");  // user-friendly message
        }
        finally {
            // Finally block always runs regardless of exception
            System.out.println("Thank you for using our calculator.");
        }

        sc.close();  // Good practice to close the scanner
    }
}
