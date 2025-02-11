import java.util.Scanner;
class SmallestDigitNumber
{
	public static void main(String[]args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter A number");
		int num = sc.nextInt();
		int max =9;
		for(int i = num;i>0;i/=10)
		{
			int dgt = i%10;
			if(max>dgt)
				max=dgt;
		}
		System.out.println("Smallest Digit From Number is "+max);
	}

}