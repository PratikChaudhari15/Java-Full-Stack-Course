import java.util.Scanner;
class Q74_AA_BA_AZ_Program
{
	public static void main(String[] args) 
	{
		System.out.println("Enter String : ");
		String name = new Scanner(System.in).next().toUpperCase();
		int res = 0;
		int count = 26;
		if(name.length()==1)
		{
			res = name.charAt(0)-64;
		}
		else
		{
			for(char ch = 'A' ; ch<= 'Z' ; ch++)
			{
				if(name.charAt(0)==ch) //AA
				{
					break;
				}
				count += 26;
			}
			res = count + (name.charAt(1)-64);
		}
		System.out.println("Count : "+count);
		System.out.println("Result : "+res);
	}
}