import java.util.Scanner;
class PasswordWithTimes
{
	public static void main(String[]args)throws InterruptedException
	{
		Scanner sc= new Scanner(System.in);
		int storePin = 143;
		int seconds= 5000;
		
		for (; ; )
		{
			int attempts=3;
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
					System.out.println("attempt left  "+(attempts-1));
				}
				attempts--;
		}
		while (attempts>=1);
		System.out.println();
		System.out.println("Phone is Disabled for " + (seconds/1000)+"Seconds");
		Thread.sleep(seconds);
		seconds *=2;
		System.out.println();

		}	
	}	
}

