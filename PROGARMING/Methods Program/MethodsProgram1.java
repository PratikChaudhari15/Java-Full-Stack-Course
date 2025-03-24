class MethodsProgram1
{
	public static void main(String[]args)
	{
		System.out.println("From main method");

		test();
		test();
		test();
	}
	public static void test()
	{
		System.out.println("From test method");
	}
}