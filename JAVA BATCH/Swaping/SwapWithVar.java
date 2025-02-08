class SwapWithVar
{
	public static void main(String []args)
	{
		int a = 2;
		int b =3;

		//int temp= 0;

		int temp = a; //2
		a = b; //3
		b = temp; //2

		System.out.print("a " +a);
		System.out.print("b " +b);
	}
}
