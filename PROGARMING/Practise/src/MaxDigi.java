import java.util.Scanner;

public class MaxDigi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();  // User input number
        int max = 0;             // To store the largest digit

        // Loop until num becomes 0
        for (int i = num; i > 0; i /= 10) {
            int dgt = i % 10;     // Get last digit

            if (max < dgt) {      // If current digit is greater than max, update max
                max = dgt;
            }
        }

        System.out.println("Largest digit is: " + max);
        sc.close(); // Good practice: close scanner to free system resources
    }
}
