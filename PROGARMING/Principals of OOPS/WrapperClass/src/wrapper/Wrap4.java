package wrapper;  // Defines the package name

public class Wrap4 {
    public static void main(String[] args) {
        // Creates a Byte object with value 100
        Byte b1 = new Byte((byte) 100);

        // Creates an Integer object with value 100
        Integer b2 = new Integer(100);

        // Compares b1 and b2 using .equals() → false, because Byte and Integer are different types
        System.out.println(b1.equals(b2));  // Output: false

        // Prints the maximum value an int can hold: 2,147,483,647
        System.out.println(Integer.MAX_VALUE);

        // Prints the minimum value an int can hold: -2,147,483,648
        System.out.println(Integer.MIN_VALUE);

        // Prints the maximum value a byte can hold: 127
        System.out.println(Byte.MAX_VALUE);

        // Prints the maximum value a long can hold: 9,223,372,036,854,775,807
        System.out.println(Long.MAX_VALUE);

        // Prints the largest positive finite value for a double: ~1.7976931348623157E308
        System.out.println(Double.MAX_VALUE);

        // Prints the maximum exponent a double can have in base 2: 1023
        System.out.println(Double.MAX_EXPONENT);

        // Prints the smallest positive normal value for a double: ~2.2250738585072014E-308
        System.out.println(Double.MIN_NORMAL);

        // Prints the smallest positive non-zero value for a double: ~4.9E-324
        System.out.println(Double.MIN_VALUE);

        // Prints the largest Unicode character value: '\uffff' → 65535
        System.out.println(Character.MAX_VALUE);

        // Prints the smallest Unicode character value: '\u0000' → 0
        System.out.println(Character.MIN_VALUE);
    }
}
