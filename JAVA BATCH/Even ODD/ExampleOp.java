import java.util.Scanner;
class ExampleOp
{
	public static void main(String[] args) 
	{
		final float pi = 22/7;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of the circle in cm:");
		float r = sc.nextInt();
		float area = pi*(r*r);
		System.out.println("The area of circle is: "+area+" sqcm");
	}
}
