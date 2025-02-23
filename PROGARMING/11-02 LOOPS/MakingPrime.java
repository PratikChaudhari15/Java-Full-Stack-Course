import java.util.Scanner;

class MakingPrime 
{
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object for input
        System.out.println("Enter A number: "); // Prompt user to enter a number
        int num = sc.nextInt(); // Read input number
        boolean flag = true; // Flag to check if number is prime

        // Loop to check if num is prime, and increment num if it's not prime
        for (int i = 2; i < num; i++) {
            if (num % i == 0) { // If num is divisible by i, it's not prime
                flag = false; // Mark flag as false (not prime)
                num++; // Increment num to check the next number
                i = 2; // Reset i to 2 to check divisibility from the start
            }
        }
        
        // Printing the next prime number found
        System.out.println("Next Prime Number: " + num);
    }
}
