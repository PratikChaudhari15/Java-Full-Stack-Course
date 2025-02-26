import java.util.Scanner; // Import Scanner class for user input

class Q139BouncyNumber {
    public static void main(String[] args) {
        System.out.println("Enter Number: ");
        int num = new Scanner(System.in).nextInt(); // Read input number from user
        int flag1 = 1, flag2 = 1, temp = num; // Flags to track increasing & decreasing order

        // Loop through each digit of the number from right to left
        while (num >= 10) { // Continue until the number has at least two digits
            // Compare the last digit (num % 10) with the second-last digit ((num/10) % 10)

            if ((num % 10) < ((num / 10) % 10)) { // If the current digit is smaller than the previous one
                flag1 = 0; // Not in increasing order
            }   

            if ((num % 10) > ((num / 10) % 10)) { // If the current digit is greater than the previous one
                flag2 = 0; // Not in decreasing order
            }       
            
            num /=
