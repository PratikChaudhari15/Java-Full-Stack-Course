package Principals_of_OOPS;

public class Student 
{
    // Default institute name (common for all students)
    private String institute = "Qspiders";

    // Instance variables to hold student details
    private String name;
    private String course;
    private double fee;
    private String branch;
    private double cgpa;
    private String degree;
    private double sscper;
    private double hscper;
    private long phoneno;

    // Constructor to initialize all fields when a new student is registered
    public Student(String name, String course, double fee, String branch, double cgpa, String degree, double sscper, double hscper, long phoneno)
    {
        this.name = name;
        this.course = course;
        this.fee = fee;
        this.branch = branch;
        this.cgpa = cgpa;
        this.degree = degree;
        this.sscper = sscper;
        this.hscper = hscper;
        this.phoneno = phoneno;

        System.out.println(name + " Students Register");
    }

    // Getter method to get institute name
    public String getInstituteName() 
    {
        return institute;
    }

    // Getter methods to access private fields
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

    // Setter method for branch — change allowed only if permission is true
    public void setbranch(boolean permission, String branch)
    {
        if (permission)
        {
            this.branch = branch;
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

    // Setter method for phone number — allowed only if valid is true
    public void setphoneno(boolean valid, long phoneno)
    {
        if (valid)
        {
            this.phoneno = phoneno;
        }
        else
        {
            System.out.println("Please give documents");
        }
    }
}
