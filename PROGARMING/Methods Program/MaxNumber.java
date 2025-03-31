// Class to find the maximum of two numbers
class MaxNumber 
{
    public static void main (String[]Args)    
    {
        // Calling the findmax method with arguments 65 and 55
        // The returned maximum value will be stored in the variable 'res'
        int res = findmax(65,55);

        // Printing the maximum value
        System.out.println(res);
    }

    // Method to find the maximum of two numbers
    public static int findmax(int a , int b)
    {
        // Using ternary operator to compare 'a' and 'b'
        // If 'a' is greater, return 'a', otherwise return 'b'
        return (a > b) ? a : b;
    }
}
