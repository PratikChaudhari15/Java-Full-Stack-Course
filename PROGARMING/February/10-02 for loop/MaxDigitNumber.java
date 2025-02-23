import java.util.Scanner;
class MaxDigitNumber
{
	public static void main(String[]args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter A number");
		int num = sc.nextInt();
		int max=0;
		int rem;
		while(num>0)
		{
			rem=num%10;
			if(max<rem)
			{
				max=rem;
			}
			num/=10;
		}
		
		System.out.println("Largest Digit From Number is "+max);
	}

}