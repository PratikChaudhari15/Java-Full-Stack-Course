package wrapper;  // Declares the package

public class CameraDriver {
    public static void main(String[] args) {
        // Create first Camera object with details
        Camera c1 = new Camera("Cannon", 12000, 14, 4, true);

        // Create second Camera object with same details
        Camera c2 = new Camera("Cannon", 12000, 14, 4, true);

        // Calls toString() automatically to display details
        System.out.println(c1);  // Uses the overridden toString()

        // Checks if c1 and c2 point to the same object → false
        System.out.println(c1 == c2);  // false (different objects in memory)

        // Checks if c1 and c2 are equal in content → true (same field values)
        System.out.println(c1.equals(c2));  // true because equals() is properly overridden

        // Prints hashCode of c1
        System.out.println(c1.hashCode());

        // Prints hashCode of c2 (should match c1’s hashCode if values are same)
        System.out.println(c2.hashCode());
    }
}
