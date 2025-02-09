class RevNum
{
	public static void main (String[]args)
	{
		int num = 123;
		int dup = num; // it is use to show original number 
		int rev = 0;

		int rem = num%10;  //123%10=3
		rev = rev*10+rem;  //0*10+3 = 3

		num = num/10;  //123/10 = 12
		rem = num%10;  //12%10 = 2
		rev = rev*10+rem;  //3*10+2 = 32

		num = num/10; // 12/10 = 1
		rem = num%10;  // 1% 10 = 1 
		rev = rev*10+rem; // 32 *10+1 = 321

		System.out.println(dup+" : "+rev);
	}
}

