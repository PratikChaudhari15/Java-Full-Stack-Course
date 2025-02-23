
import java.util.Scanner;
class Q132AutomorphicNum
// An Automorphic Number is a number whose square ends with the same number.
// Example: 76 → 76 * 76 = 5776 (last digits = 76) → Automorphic Number.

{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter A Number : ");
        int num = sc.nextInt(); // Taking user input
        
        int len = 0;  // Variable to store the number of digits in num
        int div = 1;  // Divisor to extract last 'len' digits

        // Loop to count the number of digits in num
        for (int i = num; i > 0; i /= 10)  
        {
            len++;
        }

        // Loop to calculate 10^len (divisor for extracting last 'len' digits)
        for (int i = 1; i <= len; i++)  
        {
            div *= 10;
        }

        System.out.println();
        
        // Checking if the last 'len' digits of the square of num match num itself
        if (num == (num * num) % div) 
        {
            System.out.println(num + " is an Automorphic number");    
        }
        else
        {
            System.out.println(num + " is Not an Automorphic Number");
        }
    }
}
