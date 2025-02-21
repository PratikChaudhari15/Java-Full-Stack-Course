class Pattern119
{
	public static void main(String[] args) 
	{
		int n=5;
		int a=1;
		for (int i =1;i<=n ;i++ ) 
		{
			for (int j=1;j<=i ;j++ )
			{
				System.out.print(a+" ");
				a=a+2;
			}
			System.out.println();
		}
	}
}

/*

1
3 5
7 9 11
13 15 17 19
21 23 25 27 29

*/