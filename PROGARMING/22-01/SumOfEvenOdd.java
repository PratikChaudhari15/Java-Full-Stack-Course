class SumOfEvenOdd
{
	public static void main(String []args)
	{
		int num = 7634;
		int dup = num;
		int evenSum = 0;
		int oddSum = 0;
		int temp = 0;

		int rem = num%10; //4
		temp = (rem%2==0)?(evenSum=evenSum+rem):(oddSum=oddSum+rem); 

		num=num/10; //763
		rem= num%10; //3
		temp = (rem%2==0)?(evenSum=evenSum+rem):(oddSum=oddSum+rem);

		num = num/10; //76
		rem = num%10; //6
		temp = (rem%2==0)?(evenSum=evenSum+rem):(oddSum=oddSum+rem);

		num = num/10; //7
		rem = num%10; //7
		temp = (rem%2==0)?(evenSum=evenSum+rem):(oddSum=oddSum+rem);

		System.out.println("the value is "+dup+"and even is "+evenSum+ "and odd is "+oddSum);
	}
}
