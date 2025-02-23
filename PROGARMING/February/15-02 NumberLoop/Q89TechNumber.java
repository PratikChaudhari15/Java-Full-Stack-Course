import java.util.Scanner;  // Import Scanner class for user input

class Q88TechNumber //(20+25)^2 = (45)^2 =2025is tech no
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Scanner object for input
        System.out.print("Enter Number: ");
        int num = sc.nextInt();  // Read user input
        sc.close();  // Close scanner to prevent memory leaks

        int temp = num;  // Store original number for reference
        int count = 0;  // To count the number of digits
        int div = 1;  // Divider to split the number into two halves

        // Count the number of digits in the number
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        // Tech number condition: It must have an even number of digits
        if (count % 2 == 0) {
            count = count / 2;  // Find half of the digits

            // Create the divisor to split the number into two equal halves
            while (count > 0) {
                div *= 10;
                count--;
            }

            int firstHalf = num / div;  // Extract first half of the number
            int secondHalf = num % div;  // Extract second half of the number

            // Check the Tech Number condition: (firstHalf + secondHalf)^2 == original number
            if (num == ((firstHalf + secondHalf) * (firstHalf + secondHalf))) {
                System.out.println(num + " is a Tech Number.");
            } else {
                System.out.println(num + " is NOT a Tech Number.");
            }
        } else {
            System.out.println(num + " is NOT a Tech Number (must have even digits).");
        }
    }
}
