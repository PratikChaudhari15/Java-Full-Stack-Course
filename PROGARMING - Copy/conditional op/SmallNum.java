import java.util.Scanner;
class SmallNum
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

		int Small= (a<b)?((a<c)?(a):(c)):((b<c)?(b):(c));
		System.out.println("The Small Number is " +Small);

	}
}