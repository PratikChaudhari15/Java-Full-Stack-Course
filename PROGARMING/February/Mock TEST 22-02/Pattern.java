class Pattern
{
	public static void main(String[] args) 
	{
		int num=5;
		for (int i= 5 ;i>=1 ;i--) 
		{
			int temp = num;
			for (int j =1;j<=i ;j++) 
			{
				System.out.print(temp-- +"*");	
			}
			int temp2 = num;
			for (int j =1;j<=i ;j++) 
			{
				System.out.print(temp2-- +"*");	
			}
			num--;
			System.out.println();
		}
	}
}

/*

5*4*3*2*1*5*4*3*2*1*
4*3*2*1*4*3*2*1*
3*2*1*3*2*1*
2*1*2*1*
1*1*


*/