class Series
{
	public static void main(String[]args)
	{
		int res=0;
		for(int i=12;i<=20;i++)
		{
			if(i%2==0)
			{
				res = i*i;
			}
			else
			{
				res = i*i*i;
				System.out.print(res+" ");
			}
			
		}
	}
}