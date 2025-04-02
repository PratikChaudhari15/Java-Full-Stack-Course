class SumOfDigits
{
    public static void main(String[] args) 
    {
        // Calling the sumOfDigits method with 1234 as input and storing the result in 'sum'
        int sum = sumOfDigits(5442);

        // Printing the calculated sum of digits
        System.out.println("Sum of Digits: " + sum);
    }

    // Method to calculate the sum of digits of a given number
    public static int sumOfDigits(int num)
    {
        int sum = 0; // Variable to store the sum of digits
        int rem = 0; // Variable to store the remainder (last digit)

        // Loop to extract and sum the digits
        while(num > 0)
        {
            rem = num % 10;  // Extracting the last digit
            sum = sum + rem; // Adding the last digit to the sum
            num /= 10;       // Removing the last digit from the number
        }

        // Returning the final sum of digits
        return sum;
    }
}
