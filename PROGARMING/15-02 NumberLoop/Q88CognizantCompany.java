import java.util.Scanner;  // Import Scanner class for user input
class Q88CognizantCompany {
    public static void main(String[] args) {
        int[] arr = new int[128];  // Array to store frequency of ASCII characters (0-127)
        int max = 0;  // Variable to store maximum frequency of any character

        Scanner sc = new Scanner(System.in);  // Scanner object for input
        System.out.print("Enter Name: ");
        String name = sc.nextLine();  // Read the input string
        sc.close();  // Close scanner to prevent memory leaks

        int spaceCount = 0;  // Variable to count spaces in the input

        // Loop through each character in the string
        for (char ch : name.toCharArray()) {
            if (ch == ' ') {  
                spaceCount++;  // Count spaces separately
            } else {
                arr[ch]++;  // Increment frequency of the character
            }
        }

        // Find the maximum occurring character frequency
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];  // Update max if a character appears more frequently
            }
        }

        // Calculate result: total length - (max frequency + space count)
        int result = name.length() - (max + spaceCount);
        System.out.println("Output: " + result);  // Print the final result
    }
}
