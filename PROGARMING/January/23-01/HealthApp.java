import java.util.Scanner;
class HealthApp
{
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter weight in pounds: ");
		double weightpound = sc.nextDouble();
		System.out.println("Enter your height in inches: ");
		double heightinch = sc.nextDouble();

		double weight = weightpound*0.45359;
		double height = heightinch*0.0254;

		double BMI = weight/(height*height);

		System.out.print("BMI is:  " +BMI);


	}

}