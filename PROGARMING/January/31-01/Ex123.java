class Ex123
{
	public static void main (String[]args)
	{
		for (int i= 1;i<=1 ;i++ )
		{
			int num = (int)(Math.random()*10);
			if (num>=1&&num<=3)
			{
				System.out.print(num+" ");
				continue;
			}
			i--;
		}
	}
}