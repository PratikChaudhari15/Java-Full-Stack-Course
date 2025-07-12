package Principals_of_OOPS;

// Lazy Instantiation - SIM object is only created when needed
public class Sim 
{
	String ServiceProvider;  // e.g., Jio, Airtel
	String networkType;      // 4G, 5G, etc.
	String type;             // Prepaid / Postpaid
	long SimNO;              // Mobile number
	
	public Sim() {}          // Default constructor
	
	// Parameterized constructor
	Sim(String Sp, String networkType, String simType, long simNo)
	{
		ServiceProvider = Sp;
		this.networkType = networkType;
		type = simType;
		this.SimNO = simNo;
	}
	
	public void displaySim()
	{
		System.out.println("Service Provider: " + ServiceProvider);
		System.out.println("Network Type: " + networkType);
		System.out.println("Sim Type: " + type);
		System.out.println("Sim Number: " + SimNO);
		System.out.println("-------------");
	}
}
