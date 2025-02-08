class DoubleNarrowing
{
	public static void main(String [] args)
	{
		double a = 1523;
		float b = (float) a;
		System.out.println(b);

		long c = (long) a;
		System.out.println(c);

		int d = (int) a;
		System.out.println(d);


		short e = (short) a;
		System.out.println(e);

		byte f = (byte) a;
		System.out.println(f);
	}
}