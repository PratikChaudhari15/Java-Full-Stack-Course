package TOSTRING;

public class StudentDriver {
    public static void main(String[] args) {
        Student s1 = new Student("Raju", "FC Clg", 33, "Comp", "IT");
        Student s2 = new Student("Sneha", "SP Clg", 45, "Sci", "CS");

        System.out.println(s1);            // Implicitly calls toString()
        System.out.println(s2.toString()); // Explicit call to toString()
    }
}
//“We override the toString() method to provide a human-readable string representation of an object.
//Without it, Java prints a memory address. Overriding it helps us see meaningful data when
//printing or logging objects.”

