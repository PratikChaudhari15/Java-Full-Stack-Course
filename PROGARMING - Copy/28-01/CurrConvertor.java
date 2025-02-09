import java.util.Scanner;
class CurrConvertor
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println();
		System.out.print("Enter the amount(INR) :  ");
		float inr = sc.nextFloat(); 

		System.out.println("List of Currency");
		System.out.println("1. USD");
		System.out.println("2. EUR");
		System.out.println("3. GBP");
		System.out.println("4. PKR");

		System.out.print("Enter The currency");
		String curr= sc.next().toUpperCase();

		float conCurr = 0;

		if(curr.equals("USD"))
		{
			conCurr = inr/86.56f;
			System.out.println(inr + " INR = " +conCurr+ " USD ");
		}
		else if(curr.equals("EURO"))
		{
			conCurr = inr/90.25f;
			System.out.println(inr + " INR = " +conCurr+ " EURO ");
		}
		else if(curr.equals("GBP"))
		{
			conCurr = inr/107.67f;
			System.out.println(inr + " INR = " +conCurr+ " GBP ");
		}
		else if(curr.equals("PKR"))
		{
			conCurr = inr/0.31f;
			System.out.println(inr + " INR = " +conCurr+ " PKR ");
		}
		else
		{
			System.out.println("Invalid OPTION");
		}
	}
}