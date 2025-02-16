import java.util.Scanner; // Import Scanner for user input

class OddToEven
{
    public static void main(String[] args) 
    {
        System.out.println("Enter Number: "); // Prompt user for input
        int num = new Scanner(System.in).nextInt(); // Read the input number
        int temp = num; // Store the original number
        int count = 0, rem; // Variables for digit count and remainder
        String res = "";

        // Count the number of digits in the input number
        while (num > 0)
        {
            num /= 10;
            count++;
        }

        num = temp; // Reset num to original value
        temp = 0; // Initialize temp to store modified number

        // If the number of digits is even
        if (count % 2 == 0)
        {
            int i = 1; // Multiplier for place values
            while (num > 0)
            {
                rem = num % 10; // Extract last digit

                // If digit is odd (except 9), increment it to make it even
                if (rem % 2 != 0 && rem != 9)
                {
                    rem++;
                }
                // If digit is 9, decrement it to make it even (8)
                else if (rem == 9)
                {
                    rem--;
                }

                // Construct the new number
                temp = temp + (rem * i);
                i *= 10;
                num /= 10;
            }
            System.out.println("Modified Number: " + temp);
        }
        else // If the number of digits is odd
        {
            int i = 1; // Multiplier for place values
            while (num > 0)
            {
                rem = num % 10; // Extract last digit

                // If digit is even (except 9), increment it to make it odd
                if (rem % 2 == 0 && rem != 9)
                {
                    rem++;
                }
                // If digit is 9, decrement it to make it odd (8)
                else if (rem == 9)
                {
                    rem--;
                }

                // Construct the new number
                temp = temp + (rem * i);
                i *= 10;
                num /= 10;
            }
            System.out.println("Modified Number: " + temp);
        }
    }
}
