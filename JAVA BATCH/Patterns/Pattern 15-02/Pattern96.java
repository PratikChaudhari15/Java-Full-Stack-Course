class Pattern96
{
	public static void main(String[] args) 
	{
		int num=5;
		for (int i= 5 ;i>=1 ;i-- ) 
		{
			for (int j=1;j<=(num-i);j++) 
			{
				System.out.print("  ");
			}
			for (int j =1;j<=i ;j++) 
			{
				System.out.print("*" +" ");	
			}
			System.out.println();
		}
	}
}

/*

* * * * *
* * * *
* * *
* *
*

*/