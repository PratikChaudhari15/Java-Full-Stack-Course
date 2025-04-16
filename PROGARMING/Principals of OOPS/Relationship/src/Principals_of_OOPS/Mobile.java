package Principals_of_OOPS;

public class Mobile 
{
	String brand;              // Mobile brand name
	String name;               // Model name
	double price;              // Price of the mobile
	String type;               // Type (e.g., 5G, 4G)
	Sim s;                     // Reference to the Sim class (HAS-A relationship)
	String simStatus = "Not Inserted";  // Initial SIM status

	public Mobile() {}         // Default constructor
	
	// Parameterized constructor
	Mobile(String brand, String name, double price, String type)
	{
		this.brand = brand;
		this.name = name;
		this.price = price;
		this.type = type;
		System.out.println("Mobile is created");
	}
	
	public void insertSim()
	{
		// Lazy Instantiation: Sim object is created only when this method is called
		s = new Sim("jio", "5G", "prepaid", 9370682720L);
		simStatus = "Inserted";
		System.out.println("Sim is Inserted");
	}
	public void displayMobile()
	{
		System.out.println("Brand: " + brand);
		System.out.println("Name: " + name);
		System.out.println("Price: " + price);
		System.out.println("Type: " + type);
		System.out.println("Sim Status: " + simStatus);
	}
}
