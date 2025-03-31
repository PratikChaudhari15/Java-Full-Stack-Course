// class ReverseNumber 
// {
//     public static void main(String[] args) 
//     {
//         reverse(1234);
//     }
//     public static void reverse(int num)
//     {
//         int rev = 0;
//         while(num>0)
//         {

//             int rem = num%10;  
//             rev = rev*10+rem;
//             num/=10;
//         }
//         System.out.println(rev);
//     }
// }

import java.util.Scanner; // Import Scanner class for taking user input

class ReverseNumber 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read input
        System.out.println("Enter Number"); // Prompt user to enter a number
        int num = sc.nextInt(); // Read the user input as an integer
        reverse(num); // Call the reverse method to reverse the number
    }

    public static void reverse(int num)
    {
        int rev = 0; // Initialize reversed number variable
        
        // Loop to reverse the digits of the number
        while(num > 0)
        {
            int rem = num % 10;  // Extract the last digit
            rev = rev * 10 + rem; // Append the extracted digit to reversed number
            num /= 10; // Remove the last digit from the number
        }

        System.out.println(rev); // Print the reversed number
    }
}
