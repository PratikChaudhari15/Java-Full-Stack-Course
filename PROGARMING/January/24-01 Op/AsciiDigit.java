import java.util.Scanner;
class AsciiDigit
{
	public static void main (String [] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a Digit : ");
		char ch = sc.next().charAt(0);

		String op =(ch>=48 && ch<=57)?(ch+ "  it is a digit"):(ch+ " it is not a digit");

		System.out.println(op);

	}
}