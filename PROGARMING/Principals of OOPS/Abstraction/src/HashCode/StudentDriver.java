package HashCode;

public class StudentDriver {
    public static void main(String[] args) {
        // Creating student 1
        Student s1 = new Student("Sneha", "SP Clg", 45, "Sci", "CS");

        // Printing student 1 (calls toString() if overridden)
        System.out.println(s1);

        // Creating student 2
        Student s2 = new Student("Pratik", "FC Clg", 33, "enngg", "iy");

        // Printing student 2
        System.out.println(s2);

        // Comparing references (== checks memory address)
        System.out.println(s1 == s2); // false

        // Comparing object content using .equals() method
        System.out.println(s1.equals(s2)); // depends on equals() logic

        // Printing hash codes
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
//"I overrode equals() to compare Student objects based on their content, not reference.
// I used hashCode() to ensure that logically equal objects return the same hash code,
// which is important when storing them in hash-based collections like HashSet or HashMap.
// I also added toString() to print human-readable object details."