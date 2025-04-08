// Driver class to test MethodChaining
class MethodChainingDriver
{
	public static void main(String[] args) 
	{
		// Create object
		MethodChaining m1 = new MethodChaining();

		// Assign values
		m1.origin = "Ratnagiri";
		m1.type = "Hapus";
		m1.price = 2000.0;

		// Method chaining: calling multiple methods on same object in a single line
		m1.displayprice().displaytype().displayorigin();
	}
}
