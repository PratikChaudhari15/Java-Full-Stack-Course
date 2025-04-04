class ACDriver
{
	public static void main(String[] args) 
	{
		AC a1 = new AC();

		a1.brand = "blue star";
		a1.price = 50000.0;
		a1.ton = 1.5;
		a1.mintemp = 16.0;
		a1.maxtemp = 28.0;
		a1.currtemp = 22.0;

		a1.displayDetails();
		a1.displaymin();
		a1.displaymax();
		a1.displaycurr();

	}
}