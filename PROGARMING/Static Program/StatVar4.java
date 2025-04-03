class StatVar4
{
	static String s;
	public static void main(String[]Args)
	{
		System.out.println(s);
		demo();

		String s = "Tejus";

		System.out.println(s);
		System.out.println(StatVar4.s);
	}
	public static void demo() 
	{
		s="Qspider";
		System.out.println(s);
	}
}