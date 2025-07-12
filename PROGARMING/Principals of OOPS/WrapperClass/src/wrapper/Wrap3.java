package wrapper;  // Package declaration

public class Wrap3 {
    public static void main(String[] args) {
        // ❌ This line has a syntax error:
        Byte b1 = new Byte((byte) 100);
        // 'byte(100)' is invalid Java syntax.
        // You cannot cast a literal like this. Correct way is:
        // Byte b1 = new Byte((byte) 100);

        Integer b2 = new Integer(100); // This is fine (but constructor is deprecated)

        System.out.println(b1.equals(b2));
        // This will compile if b1 is fixed, but will output 'false'
        // because b1 is a Byte and b2 is an Integer (different types).
    }
}
