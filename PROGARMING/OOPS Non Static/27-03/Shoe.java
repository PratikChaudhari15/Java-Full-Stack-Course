// Class representing a Shoe
class Shoe
{
	// Instance variables with default value
	String brand = "Reebook";  // brand is already initialized
	double price;

	// Instance block: runs automatically every time an object is created
	{
		System.out.println("Object Loading");

		// Since brand is already initialized, this check will work fine
		if (brand.charAt(0)=='N')   // Checks if the brand starts with 'N'
		{
			price = 1000.0;         // Set higher price for brands starting with N
		}
		else
		{
			price = 500;           // Otherwise, set default price
		}
	}

	// Method to display the shoe details
	public void displayShoe()
	{
		System.out.println("Brand: " + brand);
		System.out.println("Price: " + price);
	}
}
