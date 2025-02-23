import java.util.Scanner; // Import Scanner class for user input

class NumberToWord
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in); // Create Scanner object for input
        System.out.print("Enter a number: "); // Ask the user to enter a number
        int num = sc.nextInt(); // Read the number from user
        int rem; // Variable to store remainder (last digit of the number)
        String chars = ""; // String to store the word representation of the number

        int dup = num; // Store the original number for reference (not used in output)

        // Loop to extract digits one by one from the last and convert them to words
        while (num > 0)
        {
            rem = num % 10; // Extract the last digit of the number
            
            // Switch case to map digits to words
            switch (rem)
            {
                case 1:
                    chars = "One " + chars; // Append word representation at the beginning
                    break;

                case 2:
                    chars = "Two " + chars;
                    break;

                case 3:
                    chars = "Three " + chars;
                    break;

                case 4:
                    chars = "Four " + chars;
                    break;

                case 5:
                    chars = "Five " + chars;
                    break;

                case 6:
                    chars = "Six " + chars;
                    break;

                case 7:
                    chars = "Seven " + chars;
                    break;

                case 8:
                    chars = "Eight " + chars;
                    break;

                case 9:
                    chars = "Nine " + chars;
                    break;

                case 0:
                    chars = "Zero " + chars;
                    break;
            }

            num /= 10; // Remove the last digit from the number
        }

        System.out.println("Number in words: " + chars); // Print the converted number in words
        
        sc.close(); // Close the scanner to prevent memory leaks
    }
}
