class Pattern118
{
	public static void main(String[] args) 
	{
		char ch='a';
		int n =5;
		for (int i =1;i<=n ;i++ ) 
		{
			for (int j=1;j<=i ;j++ )
			{
				System.out.print((ch++)+" ");
			}
			System.out.println();
		}
	}
}
/*

a
b c
d e f
g h i j
k l m n o

*/