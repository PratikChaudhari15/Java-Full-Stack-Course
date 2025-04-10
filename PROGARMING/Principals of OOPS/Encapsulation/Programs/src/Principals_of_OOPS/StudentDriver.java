package Principals_of_OOPS;

public class StudentDriver 
{
	public static void main(String []args)
	{
		Student s1=new Student("Pratik","Java",3200.0,"deccan",7.7,"BE",88,98,987654321);
		System.out.println(s1.getBranch());
		System.out.println(s1.getInstituteName());
		System.out.println(s1.getphoneno());

		s1.setbranch(true, "Hadapsar");
		s1.setphoneno(true, 12346789);
		System.out.println(s1.getphoneno());
		System.out.println(s1.getBranch());


	}
}