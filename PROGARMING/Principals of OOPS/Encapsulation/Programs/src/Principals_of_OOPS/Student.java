package Principals_of_OOPS;

public class Student 
{
	private String institute = "Qspiders";
	private String name;
	private String course;
	private double fee;
	private String branch;
	private double cgpa;
	private String degree;
	private double sscper;
	private double hscper;
	private long phoneno;
	
	public Student(String name,String course,double fee,String branch , double cgpa,String degree,double sscper,double hscper,long phoneno)
	{
		this.name=name;
		this.course=course;
		this.fee = fee;
		this.branch=branch;
		this.cgpa=cgpa;
		this.degree=degree;
		this.sscper=sscper;
		this.hscper=hscper;
		this.phoneno=phoneno;
		System.out.println(name + "Students Register");
		
	}
	public String getInstituteName() 
	{
		return institute;
	}
	public String getName()
	{
		return name;
	}
	public String getcourse()
	{
		return course;
	}
	public double getfee()
	{
		return fee;
	}
	public String getBranch()
	{
		return branch;
	}
	public void setbranch(boolean permission,String branch)
	{
		if(permission)
		{
			this.branch=branch;
		}
		else
		{
			System.out.println("Please Take Permission");
		}
	}
	public double getcgpa()
	{
		return cgpa;
	}
	public String getdegree()
	{
		return degree;
	}
	public double getsscper()
	{
		return sscper;
	}
	public double gethscper()
	{
		return hscper;
	}
	public long getphoneno() 
	{
		return phoneno;
	}
	public void setphoneno(boolean valid,long phoneno)
	{
		if(valid)
		{
			this.phoneno = phoneno;
		}
		else
		{
			System.out.println("Please give documents");
		}
	}
}
