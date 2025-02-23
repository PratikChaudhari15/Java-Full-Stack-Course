class ProductofEvenOdd
{
	public static void main(String []args)
	{
		int num = 7634;
		int dup = num;
		int evenpro = 1;
		int oddpro = 1;
		int temp = 0;

		int rem = num%10; //4
		temp = (rem%2==0)?(evenpro=evenpro*rem):(oddpro=oddpro*rem); // 4is even so evenpro= 1*4=4

		num=num/10; //763
		rem= num%10; //3
		temp = (rem%2==0)?(evenpro=evenpro*rem):(oddpro=oddpro*rem);

		num = num/10; //76
		rem = num%10; //6
		temp = (rem%2==0)?(evenpro=evenpro*rem):(oddpro=oddpro*rem);

		num = num/10; //7
		rem = num%10; //7
		temp = (rem%2==0)?(evenpro=evenpro*rem):(oddpro=oddpro*rem);

		System.out.println("the value is "+dup+"and even product is "+evenpro+ "and odd product is  "+oddpro);
	}
}
