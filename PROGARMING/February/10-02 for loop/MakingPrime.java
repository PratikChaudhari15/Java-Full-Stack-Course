import java.util.Scanner;
class MakingPrime
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter A number: ");//7
		int num=sc.nextInt();
		int den = 2;
		while(den<num)//2<7
		{
			if(num%den==0)
			{
				break;
			}
			den++;
		}
		if(num==den)//7==7
		{
			System.out.println("Is prime");
		}
		else
			System.out.print("not prime");
	}
}