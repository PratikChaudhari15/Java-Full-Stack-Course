package Principals_of_OOPS;

public class Refill 
{
	// Attributes of Refill
	String color;
	double size;
	String refilltype;

	// Constructor to initialize Refill object
	Refill(String color, double size, String refilltype)
	{
		this.color = color;
		this.size = size;
		this.refilltype = refilltype;
	}

	// Method to display refill details
	public void displayRefill()
	{
		System.out.println("Color : " + color);
		System.out.println("Size : " + size);
		System.out.println("Type : " + refilltype);
	}
}
