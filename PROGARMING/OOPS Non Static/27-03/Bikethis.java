// Class representing a Bike
class Bikethis
{
	// Instance variables (object-level)
	String brand;   // Brand of the bike
	String model;   // Model name
	double price;   // Price of the bike
	int cc;         // Engine capacity in cc
	int milege;     // Mileage in km/l

	// Method to display bike details
	public void displayBike()
	{
		// Local variable with the same name as instance variable
		String model = "SidGadi";

		// Prints the value of instance variable 'brand'
		System.out.println("Brand : " + brand);

		// Prints the value of instance variable 'price'
		System.out.println("Price: " + price);

		// 'this.model' refers to the instance variable 'model'
		System.out.println("Model: " + this.model);

		// 'model' here refers to the local variable inside the method
		System.out.println("Model: " + model);

		// Prints the reference to the current object (memory address-like info)
		System.out.println(this);

		// Prints the engine capacity
		System.out.println("cc: " + cc);

		// Prints the mileage
		System.out.println("milege: " + milege);
	}
}