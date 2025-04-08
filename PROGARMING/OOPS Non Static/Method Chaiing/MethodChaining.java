// Class demonstrating Method Chaining
class MethodChaining
{
	double price;
	String type;
	String origin;

	// Method to display price and return current object
	public MethodChaining displayprice()
	{
		System.out.println("Price: " + price);
		return this;  // Returns current object for chaining
	}

	// Method to display type and return current object
	public MethodChaining displaytype()
	{
		System.out.println("Type: " + type);
		return this;
	}

	// Method to display origin and return current object
	public MethodChaining displayorigin()
	{
		System.out.println("Origin: " + origin);
		return this;
	}
}
