package Principals_of_OOPS;

public class MobileDriver 
{
	public static void main(String[] args) 
	{
		// Creating a Mobile object
		Mobile m = new Mobile("Samsung", "S21", 54546, "5G");

		// Display mobile details (SIM not inserted yet)
		m.displayMobile();
		
		// Insert the SIM (object created here)
		m.insertSim();
		
		// Display SIM details
		m.s.displaySim();
		
		// Display mobile details again (now SIM is inserted)
		m.displayMobile();
	}
}
