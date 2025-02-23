import java.util.Scanner;  // Import Scanner class for user input

class Q126NeonNumber { 
    // A neon number is a number where the sum of the digits of its square equals the original number.
    // Example: 9 → 9^2 = 81 → 8 + 1 = 9 (Neon Number)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create Scanner object for input
        System.out.print("Enter the Number : ");
        
        int num = sc.nextInt();   // Read input number from user
        int sqrt = num * num;     // Calculate the square of the input number
        int sum = 0;    
        int rem = 0;          

      // Extract digits from the squared number and compute the sum
		while (sqrt > 0) 
		{ 
    		rem = sqrt % 10;  // Get the last digit of the squared number
   			sum = sum + rem;  // Add the extracted digit to the sum
   			sqrt /= 10;       // Remove the last digit by dividing by 10
		}

        // Check if the sum equals the original number
        if (sum == num) 
        {
            System.out.println(num + " is a Neon Number!");
        } 
        else 
        {
            System.out.println(num + " is NOT a Neon Number.");
        }
    }
}
