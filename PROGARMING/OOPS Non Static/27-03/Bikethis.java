class Bikethis
{
	String brand;
	String model;
	double price;
	int cc;
	int milege;

	public void displayBike()
	{
		String model = "SidGadi";

		System.out.println("Brand : "+brand);
		System.out.println("Price: "+price);
		System.out.println("Model: "+this.model);
		System.out.println("Model: "+model);
		System.out.println(this);
		System.out.println("cc: "+cc);
		System.out.println("milege: "+milege);
	}
}