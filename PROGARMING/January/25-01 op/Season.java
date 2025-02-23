import java.util.Scanner;
class Season
{
	public static void main(String []args)
	{
		Scanner sc= new Scanner (System.in);
		System.out.print("Enter month ");
		String month=sc.next().toUpperCase();
		
		String op=(month.equals("OCT") || month.equals("NOV") || month.equals("DEC") || month.equals("JAN") )?(month+ " Is Winter Month"):((month.equals("FEB") || month.equals("MAR") || month.equals("APR") || month.equals("MAY"))?(month + "Is Summer month"):((month.equals("JUN") || month.equals("JULY") || month.equals("AUG") || month.equals("SEP") )?(month+ " Is Monsoon Month"):("this month dosent exist")));

		System.out.print(op);

	}
}