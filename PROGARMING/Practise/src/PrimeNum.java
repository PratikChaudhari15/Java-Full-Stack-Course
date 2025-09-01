public class PrimeNum {
    public static void main(String[] args) {
        int num = 8;  // Number to check if prime

        boolean isPrime = true;  // Assume number is prime by default

        // Prime numbers must be greater than 1
        if (num <= 1) {
            isPrime = false;  // 0 and 1 are not prime
        } else {
            // Check for factors from 2 up to num - 1
            for (int i = 2; i < num; i++) {
                // If num is divisible by any i, then it is NOT prime
                if (num % i == 0) {
                    isPrime = false;  // Found a factor
                    break;  // Exit loop early since it's confirmed not prime
                }
            }
        }
        // Output result based on isPrime flag
        if (isPrime) {
            System.out.println(num + " is a Prime Number");
        } else {
            System.out.println(num + " is not a Prime Number");
        }
    }
}
