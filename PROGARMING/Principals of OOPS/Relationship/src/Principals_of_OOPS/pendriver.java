package Principals_of_OOPS;

public class pendriver 
{
	public static void main(String[] args)
	{
		// Create a Pen object with refill
		pen p1 = new pen("Reynold", 10, "ball point", "Blue", 0.7, "Ball Points");
		p1.displaypen();
		p1.ref.displayRefill();

		System.out.println("-------------");

		// Create another Pen object
		pen p2 = new pen("Rorito", 15, "gell pen", "black", 0.5, "gel pen");
		p2.displaypen();
		p2.ref.displayRefill();
	}
}
