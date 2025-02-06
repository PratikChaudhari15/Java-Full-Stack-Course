import java.util.Scanner;
class HiTwoHiFive
{
	public static void main (String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number");
		int num = sc.nextInt();

		String hi= (num%2==0 && num%5==0)?("HitwoHifive"):((num%5==0)?("Hifive"):((num%2==0)?("Hitwo"):(" ")));
		System.out.print(hi );
	}
}

	