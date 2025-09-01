public class GoodPrimeNum
{
    public static void main(String[] args) {
        goodNum(233);
    }
    public static int goodNum(int num) {
        boolean isPrime = true;
        // ✅ Prime check
        if (num <= 1) {
            isPrime = false; // Not prime
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false; // Factor found
                    break;
                }
            }
        }
        if (!isPrime) {
            System.out.println(num + " is NOT prime");
            return 0;
        }
        // ✅ Digit check
        int temp = num;
        boolean goodprime = true; // 🔑 Must start TRUE

        while (temp > 0) {
            int rem = temp % 10;   // Get last digit
            if (rem != 2 && rem != 3 && rem != 5 && rem != 7) {
                goodprime = false; // Non-prime digit found
                break;
            }
            temp = temp / 10;      // Remove last digit
        }

        if (goodprime) {
            System.out.println(num + " is a GOOD PRIME");
            return 1;
        } else {
            System.out.println(num + " is prime but NOT a good prime");
            return 0;
        }
    }
}
