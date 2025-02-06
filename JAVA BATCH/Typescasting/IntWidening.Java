class IntWidening
{
	public static void main(String [] args)
	{
		int a = 6;
		long b = a;
		System.out.println("convert to long "+b);

		float c = a;
		System.out.println("convert to long "+c);

		double d = a;
		System.out.println("convert to float "+d);

	
	}
}