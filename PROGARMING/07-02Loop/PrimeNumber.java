import java.util.Scanner;  // Import Scanner class to take user input

class PrimeNumber
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);  // Create Scanner object for input
        System.out.print("Enter A Number : ");
        int num = sc.nextInt();  // Read user input number
        
        int count = 0;  // Variable to count factors (excluding 1 and num)

        // Loop from 2 to num/2 (no need to check beyond num/2)
        for (int i = 2; i < (num / 2); i++) 
        {
            if (num % i == 0)  // If num is divisible by i, it's not prime
            {
                count++;  // Increase count if a factor is found
            }
        }
        // If count is still 0, it's a prime number, otherwise, it's not
        System.out.print(count == 0 ? num + " is Prime " : num + " is Not Prime");
    }
}
