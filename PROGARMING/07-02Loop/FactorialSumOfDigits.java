import java.util.Scanner;
class FactorialSumOfDigits  
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A number : ");
		int num = sc.nextInt();
		int sum =0;

		while(num>0)// Loop runs until num becomes 0
		{
			int fact =1;// Reset factorial to 1 for each digit
			int rem = num%10; // Extract the last digit of num
			for (int i =1;i<=rem ;i++ )// Calculate factorial of the last digit
			{
				fact =fact*i;
			}
			num/=10; // Remove the last digit (num = num / 10)
			sum = sum+fact; // Add the factorial of this digit to sum
			System.out.println("Factorial of  "+rem+" is "+fact);
		}
		System.out.println("Sum Of Factorials : "+sum);
	}
}
//Output===
//Enter Number : 123
//Factorial Of 3 Is 6
//Factorial Of 2 Is 2
//Factorial Of 1 Is 1
//Sum Of Factorials : 9