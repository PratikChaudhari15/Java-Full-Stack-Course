class AC
{
	String brand;
	double price;
	double ton;
	double mintemp;
	double maxtemp;
	double currtemp;
	public void displayDetails()
	{
		System.out.println("brand : "+brand);
		System.out.println("price: " +price);
		System.out.println("ton: " +ton);
	}
	public void displaymax()
	{
		System.out.println("maxtemp: "+maxtemp);
	}
	public void displaymin()
	{
		System.out.println("mintemp: "+mintemp);
	}
	public void displaycurr()
	{
		System.out.println("Currenttemp: "+currtemp);
	}
}