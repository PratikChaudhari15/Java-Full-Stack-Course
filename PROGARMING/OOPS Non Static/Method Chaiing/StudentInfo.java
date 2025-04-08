class StudentInfo
{
	String name;
	int rollNo;
	String branch;

	public StudentInfo displayName()
	{
		System.out.println(name);
		return this;
	}
	public StudentInfo displayRollNo()
	{
		System.out.println(rollNo);
		return this;
	}
	public StudentInfo displayBranch()
	{
		System.out.println(branch);
		return this;
	}
}