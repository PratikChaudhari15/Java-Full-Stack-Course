package Principals_of_OOPS;
//Earlyy Binding
public class Car 
{
	String brand;          // Brand of the car
	double price;          // Price of the car
	Engine ref;            // Reference variable of Engine class (HAS-A relationship)

	public Car() // Default constructor
	{
		
	}
	
	Car(String brand, double price, int horsepower, String type) // Parameterized constructor
	{
		this.brand = brand;
		this.price = price;
		
		ref = new Engine(horsepower, type); // Creating Engine object inside Car (Composition)
		System.out.println("Car Created");
	}
	
	public void displayCar() // Method to display car details
	{
		System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
	}
}
