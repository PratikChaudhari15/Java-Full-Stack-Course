import java.util.Scanner;
class AutomorphicNum
//76*76 = 5776 the multiplcation of the num with that only and the ans in that last digit must the number same just like more num 25,
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter A Number : ");
		int num = sc.nextInt();
		int len = 0;
		int div = 1;
		for (int i = num ;i>0 ;i/=10 ) 
		{
			len++;
		}
		for (int i=1;i<=len;i++ ) 
		{
			div *=10;
		}
		System.out.println();
		if (num == (num*num)%div)
		{
			System.out.println(num+" is a Automorphic number");	
		}
		else
			System.out.println(num+ " is Not a Automorphic Number");
	}
}