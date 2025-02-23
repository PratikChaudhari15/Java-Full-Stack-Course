import java.util.Scanner;
class PoundIntoKg
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number in pounds: ");
		double pound= sc.nextDouble();
		double kilogram = (pound*0.454);

		System.out.println(kilogram);

	}
}

