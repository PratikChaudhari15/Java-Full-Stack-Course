import java.util.Scanner;
class UserName 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = sc.next().toUpperCase();
		for(int i=0 ;i<name.length();i++)
		{
			System.out.print(name.charAt(i));
			Thread.sleep(1000);
		}
	}
}


ublic static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name = sc.next().toUpperCase();

		for(int i = 0 ; i < name.length();i++)
		{

		}
		
	}