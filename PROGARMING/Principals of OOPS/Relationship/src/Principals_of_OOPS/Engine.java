package Principals_of_OOPS;

public class Engine 
{
	int horsepower;       // Horsepower of the engine
	String type;          // Type of engine (e.g., petrol, diesel)

	Engine(int horsepower, String type) // Parameterized constructor
	{
		this.horsepower = horsepower;
		this.type = type;
	}
	
	public void displayEngine() // Method to display engine details
	{
		System.out.println("Horsepower: " + horsepower);
        System.out.println("Type: " + type);
	}
}
