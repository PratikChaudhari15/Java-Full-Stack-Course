class StatVar1
{
	static int a;
	public static void main(String[] args) 
	{
		System.out.println(a);//0
		test();//0
	}
	public static void test()
	{
		System.out.println(a);
	}
}

// Static variables are variable declared in the class block and prefix with static modify is known as static variable
// Static variable can be used within the same class directly and also inside any other class using class a reference
// Static variable are sign with default values during the loading process of class