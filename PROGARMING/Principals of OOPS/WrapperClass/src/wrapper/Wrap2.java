package wrapper;  // Declares the package name

public class Wrap2 {
    public static void main(String[] args) {
        // Create two different Integer objects with the same value (10)
        Integer i1 = new Integer(10);
        Integer i2 = new Integer(10);

        // '==' checks if both references point to the exact same object in memory
        System.out.println(i1 == i2);  // false → because i1 and i2 are two different objects

        // '.equals()' checks if the values inside the objects are the same
        System.out.println(i1.equals(i2));  // true → because both have the value 10

        // '.hashCode()' returns an int hash code based on the value
        System.out.println(i1.hashCode());  // same value → same hash code
        System.out.println(i2.hashCode());  // same as i1's hash code
    }
}
