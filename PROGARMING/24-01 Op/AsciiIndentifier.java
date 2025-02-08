import java.util.Scanner;
class AsciiIndentifier
{
	public static void main (String [] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a Any Key : ");
		char ch = sc.next().charAt(0);

		String op =(ch>=97 && ch<=122)?(ch+ "  it is a Lowercase Character"):((ch>=65 && ch<=90)?(ch+ "  it is a Uppercase charater "):((ch>=48 && ch<=57)?(ch+ "  It is Number Digits" ):((ch>=32  && ch<=47 || ch>=58 && ch<=64 || ch>=91 && ch<=96 || ch>=123 && ch<=126)?(ch+ "  It is a Speacil Charater"):(ch+ "They are control charater"))));

		System.out.println(op);

	}
}