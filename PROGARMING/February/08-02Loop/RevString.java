import java.util.Scanner; // Import Scanner class for user input

class ReverseString
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in); // Create Scanner object for input
        System.out.print("Enter a String: "); // Prompt user to enter a string
        String str = sc.nextLine(); // Read the string from user
        
        String rev = ""; // Variable to store the reversed string

        // Loop to reverse the string
        for (int i = str.length() - 1; i >= 0; i--) 
        {
            rev = rev + str.charAt(i); // Add characters in reverse order
        }

        // Print the reversed string
        System.out.println("Reversed String: " + rev);
    }
}
