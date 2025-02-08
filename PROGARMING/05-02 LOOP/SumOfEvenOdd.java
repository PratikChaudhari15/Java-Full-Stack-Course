import java.util.Scanner;
class SumOfEvenOdd
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a Number: ");
		int num = new Scanner(System.in).nextInt(); 
		int dup = num ;
		int sum = 0; 
		while(num%2==0)
		{
			int rem = num%10; //4
			sum +=rem ; //4
			num/=10; //
			System.out.println(sum);
			System.out.println(dup);
		}
	}
}
