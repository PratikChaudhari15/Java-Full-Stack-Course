public class SumEvenodd
{
    public static void main(String[] args) {
        int num = 12345;
        int evensum =0;
        int oddsum =0;
        int dup = num;


        while(num>0)
        {
            int rem = num%10;
            if (rem%2==0)
            {
                evensum =  evensum + rem;
            }
            else {
                oddsum = oddsum + rem;
            }
            num = num/10;
        }
        System.out.println("The sum is " + evensum );
        System.out.println("The sum is " + oddsum );
    }



}
