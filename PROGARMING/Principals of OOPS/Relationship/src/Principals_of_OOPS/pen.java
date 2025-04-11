package Principals_of_OOPS;

public class pen 
{
	// Attributes of pen
	String brand;
	double price;
	String type;
	Refill ref; // HAS-A relationship (pen has-a refill)

	// Default constructor
	public pen()
	{
	}

	// Parameterized constructor to create pen and refill
	pen(String brand, double price, String type, String color, double size, String refilltype)
	{
		ref = new Refill(color, size, refilltype); // Creating refill object while creating pen
		this.brand = brand;
		this.price = price;
		this.type = type;

		System.out.println("Pen Created");
	}

	// Method to display pen details
	public void displaypen()
	{
		System.out.println(brand);
		System.out.println(price);
		System.out.println(type);
	}
}
