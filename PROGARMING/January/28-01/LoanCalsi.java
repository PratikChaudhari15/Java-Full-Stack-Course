import java.util.Scanner;
class LoanCalsi
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("  Loan Calcullator");
		System.out.println();
		System.out.println("Enter the amount: " );
		float amount = sc.nextFloat();
		System.out.println("ROI: ");
		float roi = sc.nextFloat();
		System.out.println("Enter The Tenure (Month): ");
		int month = sc.nextInt();


		String str  =(month/12+ "." +month%12);
		float con =Float.parseFloat(str);

		System.out.println("Loan Calculation");
		System.out.println("Principal Amonunt: "+amount);
		System.out.println("RoI : "  +roi + "%");
		System.out.println("Tenure : "+month+ "months");

		float intYear = amount *roi/100;
		float totalInter = intYear*con;
		System.out.println("Interest : "+totalInter);
		float outstanding = amount+totalInter;
		System.out.println("Total Outstanding amount: " +(outstanding));
		System.out.println("Emi : "+(outstanding/month)+"rs");
	}
}