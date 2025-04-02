class PrimeCheck {
    public static void main(String[] args) {
        // Calling the isPrime method with 13 as input and storing the result
        boolean result = isPrime(13);

        // Printing whether the number is prime or not
        System.out.println("Is Prime? " + result);
    }

    // Method to check whether a number is prime
    static boolean isPrime(int num) {
        if (num < 2) return false; // Numbers less than 2 are not prime

        // Loop to check divisibility from 2 to num/2
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) // If divisible by any number, it's not prime
                return false;
        }
        
        return true; // If no divisor is found, the number is prime
    }
}
// How the Flow Works:
// Execution starts in main() method.

// Calls isPrime(13), passing 13 as an argument.

// Inside isPrime():

// If num is less than 2, return false.

// Loop checks divisibility from 2 to num/2.

// If num is divisible by any i, return false (not prime).

// If no divisor is found, return true (prime).

// The result is stored in result and printed in main().