import java.util.Scanner;
class PasswordWithTimes
{
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		int storePin = 143;

		do
		{
			System.out.println("Enter A passWord: ");
			int pin = sc.nextInt();
			if (storePin==pin)
			{
				System.out.println("Phone is Unlock");
			}
			else
			{
				System.out.println("Wrong Pin");
			}

		}
		while ();
		


		
	}
}
