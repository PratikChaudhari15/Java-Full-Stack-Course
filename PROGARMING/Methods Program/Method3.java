class Method3
{
	public static void main(String[]Args)
	{
		int a=10;
		System.out.println(a);
		test();
	}
	public static void test()
	{
		System.out.println(a);
	}
}
//  Errors in Your Code
// a is a local variable inside main(), but you're trying to access it in test()

// Local variables are only accessible within the method where they are declared.

// a is declared inside main(), so test() cannot access it.