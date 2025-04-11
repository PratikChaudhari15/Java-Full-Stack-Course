package Principals_of_OOPS;

public class StudentDriver 
{
    public static void main(String[] args)
    {
        // Creating object s1 and registering a new student
        Student s1 = new Student("Pratik", "Java", 3200.0, "deccan", 7.7, "BE", 88, 98, 987654321);

        // Display initial details
        System.out.println(s1.getBranch());            // deccan
        System.out.println(s1.getInstituteName());     // Qspiders
        System.out.println(s1.getphoneno());           // 987654321

        // Update branch and phone number with permission/validation
        s1.setbranch(true, "Hadapsar");                // branch updated
        s1.setphoneno(true, 12346789);                 // phone updated

        // Display updated details
        System.out.println(s1.getphoneno());           // 12346789
        System.out.println(s1.getBranch());            // Hadapsar
    }
}

//✅ Flow of Execution
//StudentDriver class runs and creates a new Student object s1.
//
//The constructor of Student is called and initializes all student info.
//
//Initial values like branch, institute name, and phone number are printed.
//
//Then, setbranch and setphoneno methods are called to update values (with permission).
//
//Updated values are printed again.
