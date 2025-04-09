// Shoe class representing a Shoe object
class Shoe
{
	// Instance variables with default and assigned values
	String brand = "Reebbok"; // Initialized here
	double price;
	int size;
	String color;
	String type;

	// 🔄 Non-static block (runs during object creation before constructor)
	{
		System.out.println("Non Static Block starts");

		// Check brand's first letter
		if (brand.charAt(0) == 'N') 
		{
			price = 1000;	
		}
		else 
		{
			price = 500; // since brand = "Reebbok", this runs
		}

		// Call method to print shoe details
		displayShoe(); // Note: other fields are still default

		System.out.println("Non static block ends");
	}

	// 1️⃣ No-arg constructor
	Shoe()
	{
		// Does nothing here, just object creation
	}

	// 2️⃣ Parameterized constructor
	Shoe(double price, int size, String type, String color)
	{
		System.out.println("Constructor Block Starts");

		// Assign values to instance variables
		this.price = price;
		this.size = size;
		this.type = type;
		this.color = color;

		System.out.println("Constructor block ends");
	}

	// Method to display values of Shoe object
	public void displayShoe()
	{
		System.out.println(brand);
		System.out.println(price);
		System.out.println(size);
		System.out.println(color);
		System.out.println(type);
	}
}
