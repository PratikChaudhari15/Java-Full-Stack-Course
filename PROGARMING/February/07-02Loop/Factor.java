import java.util.Scanner;  // Import Scanner class for user input

class Factor 
	{
    public static void main(String[] args) 
		{
        Scanner sc = new Scanner(System.in); // Create Scanner object to take input from the user
        
        System.out.println("Enter the number: ");
        int num = sc.nextInt();  // Read an integer from the user
        
        System.out.println("Factors: ");

        // Loop from 1 to num to check for factors
        for (int i = 1; i <= num; i++) { 
            // If num is completely divisible by i, then i is a factor of num
            if (num % i == 0) {  
                System.out.println(i + " ");  // Print the factor
            }
        }
    }
}
