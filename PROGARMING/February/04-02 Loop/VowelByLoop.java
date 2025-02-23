import java.util.Scanner;
class VowelByLoop
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name = sc.next();
		System.out.print(" Vowel : ");

		for(int i = 0; i<name.length();i++)
		{
			if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u'||name.charAt(i)=='A'||name.charAt(i)=='E'||name.charAt(i)=='I'||name.charAt(i)=='O'||name.charAt(i)=='U')
			{
				System.out.print(name.charAt(i)+" ");
			}
		}
	}
}
 