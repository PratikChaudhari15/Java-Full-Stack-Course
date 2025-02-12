import java.util.Scanner;
class FactorNum
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num = sc.nextInt();
		int fact1=1; // Variable to store factorial
		int fact2 =1;

		for(int i = 1; i<=num ; i++)//Logic Number 1
		{
			fact1*=i;// Multiply numbers from 1 to num
			// This Logic is use to do from 1 to n number 
		}
		for(int i = num; i>=1;i--)//Logic Number 2
		{
			fact2*=i;// This Logic is use to do from n to 1 number 
		}
		System.out.println(num+" Factorial Is : "+fact1);
	}
}