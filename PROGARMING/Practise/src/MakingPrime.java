public class MakingPrime
{
    public static void main(String[] args) {
        int num = 8;
        int dup = num;

        boolean flag = true;

        for (int i= 2;i<num;i++)
        {
            if (num%2==0)
            {
                flag = false;
                num++;
                i=2;
                System.out.println(dup + " is not a prime but ");
            }
        }

        System.out.println(num + " is a prime ");
    }
}
