// Driver class to run the program
class BikethisDriver
{
	public static void main(String[] args) 
	{
		// Creating an object of Bikethis class
		Bikethis b1 = new Bikethis();

		// Assigning values to the object's instance variables
		b1.brand = "Bajaj";
		b1.model = "N160";
		b1.price = 175000.0;
		b1.cc = 160;
		b1.milege = 50;
		
		// Calling method to display all values
		b1.displayBike();
	}
}