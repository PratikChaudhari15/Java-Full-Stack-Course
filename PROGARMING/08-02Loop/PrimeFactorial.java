import java.util.Scanner; // Import Scanner class for user input

class PrimeFactorial
{
    public static void main(String[] args) 
    {
        boolean flag = true; // Flag to check prime numbers
        System.out.print("Enter a Number: "); // Prompt user input
        int num = new Scanner(System.in).nextInt(); // Read input number from user

        // Loop to find factors of the given number
        for (int i = 2; i < num; i++) 
        {
            if (num % i == 0) // Check if 'i' is a factor of 'num'
            {
                flag = true; // Assume 'i' is prime

                // Check if 'i' is a prime number
                for (int j = 2; j < i; j++) 
                {     
                    if (i % j == 0) // If 'i' is divisible by any number other than 1 and itself
                    {
                        flag = false; // 'i' is not a prime number
                        break; // Exit the loop early
                    }
                }
                // If 'i' is a prime number, print it
                if (flag)
                    System.out.println(i);
            }
        }
    }
}
