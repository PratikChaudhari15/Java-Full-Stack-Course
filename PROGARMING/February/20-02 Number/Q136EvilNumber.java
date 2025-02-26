import java.util.Scanner; // Import Scanner class for user input
class Q136EvilNumber {
    public static void main(String[] args) {
        System.out.println("Enter Number: ");
        int num = new Scanner(System.in).nextInt(); // Read input number from user
        int dup = num; // Store the original number for final output
        int count = 0; // Counter to count the number of 1s in binary representation
        // Convert number to binary and count the number of 1s
        while (num > 0) {
            if (num % 2 == 1) // Check if the last binary digit is 1
                count++; // Increment count if 1 is found
            num /= 2; // Divide number by 2 to shift right (move to next binary digit)
        }
        // Check if the count of 1s is even
        if (count % 2 == 0) {
            System.out.println(dup + " is an Evil Number"); // Even 1s → Evil Number
        } else {
            System.out.println(dup + " is Not an Evil Number"); // Odd 1s → Not an Evil Number
        }
    }
}
