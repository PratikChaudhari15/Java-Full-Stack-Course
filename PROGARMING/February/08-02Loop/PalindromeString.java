import java.util.Scanner; // Import Scanner class for user input

class PalindromeString
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in); // Create Scanner object for input
        System.out.println("Enter A String: "); // Ask user to enter a string
        String str = sc.nextLine().toUpperCase(); // Read input string from user
        String rev = ""; // Initialize an empty string to store the reversed string

        // Loop to reverse the string
        for (int i = str.length() - 1; i >= 0; i--) 
        {
            rev = rev + str.charAt(i); // Append each character from the end to rev
        }

        System.out.println("Reversed String: " + rev); // Display the reversed string

        // Check if the original string and reversed string are the same
        if (rev.equals(str)) // Use .equals() to compare strings (not ==)
        {
            System.out.println("This is a Palindrome String"); // If true, it's a palindrome
        }
        else
        {
            System.out.println("This is not a Palindrome String"); // If false, not a palindrome
        }
    }
}
