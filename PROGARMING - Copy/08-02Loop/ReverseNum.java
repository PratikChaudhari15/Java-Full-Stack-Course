import java.util.Scanner;
class ReverseNum
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number");//1234
		int num = sc.nextInt();
		int rev = 0;
		while(num>0)
		{
			int rem = num%10;//4 ,3 , 2,1
			rev = rev*10+rem; //4 ,43 ,432 ,4321
			num/=10;//123 ,12,1
		}
		System.out.println(rev);
	}
}