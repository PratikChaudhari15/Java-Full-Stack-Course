import java.util.Scanner;
class EvenOdd2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a num: ");
		int num = sc.nextInt();
		System.out.println(num%2==0);//logic with modulus

		System.out.println((num/2)*2==num);// logic 1 without modulus

		System.out.println((num/2)==(num/2.0)); //logic 2 without modules

	}
}
