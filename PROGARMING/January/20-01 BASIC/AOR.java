import java.util.Scanner;
class AOR
{
	public static void main (String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Height of rectangle");
		float height = sc.nextFloat();
		System.out.print("Enter a Width of Rectangle ");
		float width = sc.nextFloat();
		Float area = height*width;
		System.out.println("the area of rectange is: "+area);
	}
}