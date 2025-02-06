class SumOfDigits
{
	public static void main (String[] args)
	{
		int num = 1234;
		int dup = num;
		int sum = 0;
		
		int rem = num%10; //4
		sum = sum+rem; //4

		num = num/10; //123
		rem = num%10; //3
		sum = sum+rem; //4+3=7

		num = num/10; //12
		rem = num%10; //2
		sum = sum+rem; //7+2=9

		num = num/10; //1
		rem = num%10; //1
		sum = sum+rem; //9+1=10

		System.out.println(sum);
	}
}