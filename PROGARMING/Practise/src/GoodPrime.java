import java.util.Scanner;

public class GoodPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // ✅ Create scanner to read input
        System.out.print("Enter upper limit: "); // 👉 Ask user
        int num = sc.nextInt(); // ✅ E.g., user enters 20
        // Call method to find how many good primes up to num
        int count = findgoodprime(num);

        // Print final result
        System.out.println("Good Prime Count: " + count);
    }

    public static int findgoodprime(int limit) {
        int count = 0; // ✅ Total good prime counter, e.g. starts at 0

        // ✅ Loop all numbers from 2 to limit, e.g. 2..20
        for (int i = 2; i <= limit; i++) {
            boolean flag = true; // ✅ Assume current i is prime
            // Example: i = 5

            // ✅ Check if i is prime by trying to divide by all smaller numbers
            for (int j = 2; j < i; j++) {
                // Example: i=5, j=2 → 5%2 = 1 → OK
                if (i % j == 0) {
                    flag = false; // ❌ Found factor, so not prime
                    break; // ✅ Exit inner loop
                }
            }

            if (flag) { // ✅ If still prime after inner loop
                int temp = i; // ✅ temp = i (e.g. temp = 5)

                System.out.println("Prime: " + temp); // 👉 Print normal prime

                boolean goodPrime = true; // ✅ Assume it is good prime

                // ✅ Check each digit to see if it is 2, 3, 5, or 7
                while (temp > 0) {
                    int rem = temp % 10; // ✅ Get last digit
                    // Example: temp = 5 → rem = 5
                    if (rem != 2 && rem != 3 && rem != 5 && rem != 7) {
                        goodPrime = false; // ❌ Found a bad digit
                        break; // Stop checking further digits
                    }
                    temp = temp / 10; // ✅ Remove last digit
                    // Example: temp = 5/10 → 0 → loop ends
                }

                if (goodPrime) { // ✅ If all digits are prime digits
                    System.out.println("Good Prime: " + i);
                    count++; // ✅ Increase good prime counter
                }
            }

            // Example run:
            // i = 2 → prime → digit 2 → OK → Good Prime!
            // i = 5 → prime → digit 5 → OK → Good Prime!
            // i = 11 → prime → digits: 1 ❌ → not good prime
        }

        return count; // ✅ Return how many good primes found
    }
}
