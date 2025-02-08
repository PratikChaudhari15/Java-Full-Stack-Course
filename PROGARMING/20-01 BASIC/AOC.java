import java.util.Scanner;
class AOC
{
	public static void main(String [] args)
	{
		Scanner sc= new Scanner (System.in);
		System.out.print("Enter a radius : ");
		float r = sc.nextFloat();
		float Area=(3.14f*r*r);
		float Perimeter=(2*3.14f*r);
		System.out.println("Area of Circle is : "+Area);
		System.out.println("Perimeter of Circle is : "+Perimeter);
	}
}
