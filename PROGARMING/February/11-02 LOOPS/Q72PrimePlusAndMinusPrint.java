import java.util.Scanner;
class Q72PrimePlusAndMinusPrint
{
	public static void main(String[] args) 
	{
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter Number : ");
		int num = sc.nextInt();//7
		int temp1 = num;//7
		int temp2 = num;//7
		int add1,add2;
		temp1--;//6 5
		temp2++;//8
		if(temp1==1 ||temp1==0)
			temp1=2;
		for(int i = 2 ; i<temp1 ; i++)//6 //5
		{
			flag = false;
			if(temp1%i==0)
			{
				flag=true;
				i = 1;
				temp1--;
			}
		}
		for(int i = 2 ; i<temp2 ; i++)
		{
			flag = false;
			if(temp2%i==0)
			{
				flag=true;
				i = 1;
				temp2++;
			}				
		}
		add1 = num-temp1; // subtract 
		add2 = temp2-num; //subtract
		if(add1==1)
			System.out.println("Prime Number :"+temp2);
		else if(add1<add2)
			System.out.println("Prime Number : "+temp1);
		else if(add2<add1)
			System.out.println("Prime Number : "+temp2);
		else if(add1==add2)
			System.out.println("Prime Number : "+temp1+" "+temp1);
	    System.out.println("Previous Prime Number : "+temp1+" Next Prime Number : "+temp2);
	}
}