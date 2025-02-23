import java.util.Scanner;
class CtoF
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Celsius : ");
		double C= sc.nextDouble();
		double F= ((9.0/5)*C+32); //we can use 1.8 insted of 9.0/5 dont use 9/5 it take int value
		System.out.println("Celsius to Farenit is: " + F);
	}
}
