import java.util.Scanner; // Import Scanner class for user input

class ReverseNum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in); // Create Scanner object for input
        System.out.println("Enter A Number"); // Prompt user to enter a number
        
        int num = sc.nextInt(); // Read the number from user
        int rev = 0; // Variable to store the reversed number

        // Loop to reverse the number
        while (num > 0)
        {
            int rem = num % 10;  // Extract the last digit
            rev = rev * 10 + rem; // Append last digit to reversed number
            num /= 10; // Remove the last digit from original number
        }

        // Print the reversed number
        System.out.println("Reversed Number: " + rev);
    }
}
