import java.util.Scanner;
class Q135DecimalToBinaryUsingStringMethod
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Number : ");
		int num = new Scanner(System.in).nextInt();
		int num1 = num ;
		String bin = Integer.toBinaryString(num);
		System.out.println(bin);
	
	}
}