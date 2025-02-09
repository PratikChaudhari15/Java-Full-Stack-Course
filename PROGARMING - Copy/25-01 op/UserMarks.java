import java.util.Scanner;
class UserMarks
{
	public static void main(String []args)
	{
		Scanner sc= new Scanner (System.in);
		System.out.print("Enter total marks: ");
		float marks=sc.nextFloat();

		float permarks= (marks*100.0f)/600.0f;
		System.out.println(permarks+ " is your Percentage");

		String op=(permarks>75)?("You are Pass And Grade Is A"):((permarks>60&&permarks<75)?("You are pass and Grade is B"):((permarks>35&&permarks<60)?("You are Pass And Grade Is C"):("Yor are fail")));
		System.out.println(op);

	}
}
// 75-100 grade a
//60-75 b
//35-60 c
//0-35 fail