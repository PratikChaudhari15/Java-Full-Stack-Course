import java.util.Scanner;
class Ascii
{
	public static void main (String [] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a character : ");
		char ch = sc.next().charAt(0);

		String op =(ch<=97 && ch<=122)?(ch+ " its Not Lower"):(ch+ " its  Lower");

		System.out.println(op);

	}
}