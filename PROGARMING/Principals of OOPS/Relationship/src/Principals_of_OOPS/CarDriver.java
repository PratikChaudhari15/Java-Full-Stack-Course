package Principals_of_OOPS;

public class CarDriver 
{
	public static void main(String[] args) 
	{
		// Creating a Car object and initializing brand, price, horsepower, and engine type
		Car c1 = new Car("Tata Nexon", 900000, 120, "petrol");
		
		// Displaying car details
		c1.displayCar();
		
		// Displaying engine details using Engine reference
		c1.ref.displayEngine();
	}
}
