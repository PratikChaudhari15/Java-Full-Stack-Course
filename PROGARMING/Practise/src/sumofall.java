public class sumofall
{
    public static void main(String[] args) {
        int num = 12462404;
        int sum = 0;
        int dup = num;

        while (num != 0) {
            int rem = num%10;
            sum += rem;
            num = num/10;
        }
        System.out.println("The sum is " + sum );

    }
}
