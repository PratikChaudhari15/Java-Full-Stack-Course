import java.util.Scanner;
class Vowel
{
	public static void main (String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a vowel ");
		char ch = sc.next().charAt(0);

		String op = (ch =='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')?(ch+ "Its Vowel"):(ch+ "Its not Vowel");
		System.out.print(op);
	}
}
		
