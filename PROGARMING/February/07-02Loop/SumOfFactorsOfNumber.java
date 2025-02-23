import java.util.Scanner;  // Import Scanner class to take user input

class SumOfFactorsOfNumber
{ 
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);  // Create Scanner object for input
        System.out.print("\nEnter Number : ");
        int num = sc.nextInt();  // Read user input number
        
        int sum = 0;  // Initialize sum variable to store the sum of factors

        System.out.println("Factors are  : ");
        
        // Loop from 2 to (num - 1) to find factors (excluding 1 and num)
        for (int i = 2; i < num; i++) 
        {
            if (num % i == 0)  // If num is divisible by i, then i is a factor
            {
                System.out.print(i + ", ");  // Print the factor
                sum += i;  // Add factor to sum
            }
        }
        // Print the sum of all found factors
        System.out.print("Sum of Factors Of Number is  : " + sum);
    }
}
