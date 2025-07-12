package TOSTRING;

public class Student {
    String name;
    String college;
    int rollno;
    String degrees;
    String stream;

    public Student() {
    }

    public Student(String name, String college, int rollno, String degrees, String stream) {
        this.name = name;
        this.college = college;
        this.rollno = rollno;
        this.degrees = degrees;
        this.stream = stream;
    }

    @Override
    public String toString() {
        return "Name: " + name +
                ", College: " + college +
                ", Rollno: " + rollno +
                ", Degrees: " + degrees +
                ", Stream: " + stream;
    }
}
