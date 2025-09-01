package HashCode;

public class Student {
    // Fields to store student details
    String name;
    String college;
    int rollNo;
    String degree;
    String Stream;

    // Default constructor
    public Student() {
    }

    // Parameterized constructor
    public Student(String name, String college, int rollNo, String degree, String Stream) {
        this.name = name;
        this.college = college;
        this.rollNo = rollNo;
        this.degree = degree;
        this.Stream = Stream;
    }

    // Custom equals method to compare two Student objects
    @Override
    public boolean equals(Object o) {
        // Cast the object to Student
        Student s = (Student) o;

        // ❗ Bad practice: using '==' to compare strings
        // Use .equals() for string content comparison
        // This compares references, not actual text
        if (this.name.equals(s.name) &&
                this.college.equals(s.college) &&
                this.rollNo == s.rollNo &&
                this.degree.equals(s.degree) &&
                this.Stream.equals(s.Stream)) {
            return true;
        }

        return false;
    }

    // Generates hash code based on all fields
    @Override
    public int hashCode() {
        return rollNo + name.hashCode() + college.hashCode() + degree.hashCode() + Stream.hashCode();
    }

    // Optional: override toString for better print output
    @Override
    public String toString() {
        return "Name: " + name + ", College: " + college + ", RollNo: " + rollNo +
                ", Degree: " + degree + ", Stream: " + Stream;
    }
}
