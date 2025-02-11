import java.util.Scanner;
class MaxDigitNumber
{
	public static void main(String[]args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter A number");
		int num = sc.nextInt();
		int max =0;
		for(int i = num;i>0;i/=10)
		{
			int dgt = i%10;
			if(max<dgt)
				max=dgt;
		}
		System.out.println("Largest Digit From Number is "+max);
	}

}