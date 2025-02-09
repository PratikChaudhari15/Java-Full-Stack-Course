import java.util.Scanner;
class Numofyear
{
	public static void main (String [] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the minutes");
		long min = sc.nextLong();
		long year = min/(365*24*60);
		long mindays = min%(365*24*60);
		long days = mindays/(24*60);
		System.out.println(min + "minutes is " +year+ "Years" +days + "days");
	}
}


