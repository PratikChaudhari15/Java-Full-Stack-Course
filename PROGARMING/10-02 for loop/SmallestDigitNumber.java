import java.util.Scanner;
class SmallestDigitNumber
{
	public static void main(String[]args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter A number");
		int num = sc.nextInt();
		int min=9;
		int rem;

		while(num>0)
		{
			rem=num%10;
			if (min>rem) 
			{
				min=rem;	
			}
			num/=10;
		}
		System.out.println("Smallest Digit From Number is "+min);
	}

}