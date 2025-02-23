import java.util.Scanner;
class TempConvertor
{
	public static void main(String[]args)
	{
		int choice;
		double temp;
		Scanner sc=new Scanner(System.in);
			System.out.println(" ******* Temperature Converter ******** ");
			System.out.println("Enter 1.Convert Celsius(C) To Fahrenheit (F), Kelvin (K), Rankine (R) ");
			System.out.println("Enter 2.Convert Fahrenheit (F) To Celsius(C), Kelvin (K), Rankine (R) ");
			System.out.println("Enter 3.Convert  Kelvin (K) To Celsius(C), Fahrenheit (F), Rankine (R) ");
			System.out.println("Enter 4.Convert Rankine (R) To Celsius(C), Fahrenheit (F), Kelvin (K) ");
			System.out.println("Enter 5.Exit");
			System.out.print("\n Enter Choice : ");
			choice = sc.nextInt();
			System.out.print("\n Enter Temperature : ");
			temp=sc.nextDouble();

			switch(choice)
			{
				case 1:
				{
					System.out.println("Celsius (C) To Fahrenheit (F): "+ ((temp*9.0/5.0)+32.0));
					System.out.println("Celsius (C) To Kelvin (K): "+(temp + 273.15));
					System.out.println("Celsius (C) To Rankine (R): "+((temp+273.15)*(9.0/5.0)));
					break;
				}
				case 2 :
				{
					System.out.println("Fahrenheit (F) To Celsius (C):: "+((temp-32.0)*(5.0/9.0)));
					System.out.println("Fahrenheit (F) To Kelvin (K): "+((temp + 459.67)*(5.0/9.0)));
					System.out.println("Fahrenheit (F) To Rankine (R): "+(temp + 459.67));
					break;
				}
				case 3:
				{
					System.out.println("Kelvin (K) To Celsius (C):: " + (temp - 273.15));
					System.out.println("Kelvin (K) To Fahrenheit (F): " + ((temp * 9.0 / 5) - 459.67));
					System.out.println("Kelvin (K) To Rankine (R): " + (temp * 9.0 / 5));
					break;
				}
				case 4:
				{
					System.out.println("Rankine (R) To Celsius (C):: " + ((temp - 491.67) * 5.0 / 9));
					System.out.println("Rankine (R) To Fahrenheit (F): " + (temp - 459.67));
					System.out.println("Rankine (R) To Kelvin (K): " + (temp * 5.0 / 9));
					break;
				}
								
				case 5:
				{
					System.exit(0);
				}
				default:
				{
					System.out.println("Invalid Choice");
				}
		}	
	}
}
