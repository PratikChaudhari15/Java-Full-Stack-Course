import java.util.Scanner;
class Q69AndQ70HighestRepeatingDigit 
{
	 public static void main(String args[])
     {
		int num = new Scanner(System.in).nextInt();
		int max = 0, min = 9, hdigits = 0,lDigits = 0 ;
		for(int i = 0 ;i <=9 ; i++)
		{ 
			int count = 0;
			for(int j = num ; j>0 ; j/=10)
			{
				int rem = j%10;
				if(i==rem)
				{
					count++;
				}
			}
			if(count!=0)
			{
				if(max<count)
				{
					max = count;
					hdigits = i;
				}
				if(count<min)
				{
					min = count;
					lDigits = i;
				}
			}
		}
		System.out.println("Highest Repeated Digit :"+hdigits);
		System.out.println("Lowest Repeated Digit :"+lDigits);
     }
}