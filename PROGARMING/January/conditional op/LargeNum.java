import java.util.Scanner;
class LargeNum
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number A :");
		int a = sc.nextInt();
		System.out.print("Enter Number B :");
		int b = sc.nextInt();
		System.out.print("Enter Number C :");
		int c = sc.nextInt();

		int large= (a>b)?((a>c)?(a):(c)):((b>c)?(b):(c));
		System.out.println("The Large Number is " +large);

	}
}