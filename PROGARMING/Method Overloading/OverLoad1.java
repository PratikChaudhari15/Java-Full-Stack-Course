class OverLoad1
{
	public static void main(String[] args) 
	{
		add(15,15);
		add(15.50,15.30);
		add('a','b');
		add("Pratik","chaudhari");
	}
	public static void add(int a,int b)
	{
		System.out.println((a+b));
	}
	public static void add(double d1,double d2)
	{
		System.out.println(d1+d2);
	}
	public static void add(char c1,char c2)
	{
		System.out.println(c1+c2);
	}
	public static void add(String s1 , String s2)
	{
		System.out.println(s1+s2);
	}
}