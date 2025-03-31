import java.util.Scanner; // Import Scanner class to take input

class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object

        System.out.print("Enter a number: "); // Ask user for input
        int num = sc.nextInt(); // Read user input

        checkEvenOdd(num); // Call method to check if the number is even or odd
    }

    // Method to check if a number is even or odd
    static void checkEvenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
    }
}
