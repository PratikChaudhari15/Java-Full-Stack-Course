class StudentInfoDriver
{
	public static void main(String[] args) 
	{
		StudentInfo s1 = new StudentInfo();

		s1.name = "Pratik";
		s1.rollNo = 101;
		s1.branch = "Computer";

		s1.displayName().displayRollNo().displayBranch();
	}
}