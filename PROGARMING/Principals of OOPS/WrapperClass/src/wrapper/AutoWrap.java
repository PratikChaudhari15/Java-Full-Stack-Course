package wrapper;  // Declares the package name

public class AutoWrap {
    public static void main(String[] args) {
        // Autoboxing: primitive int 10 is automatically converted to an Integer object
        Integer i = 10;
        System.out.println(i);  // Output: 10

        // Auto-unboxing: Integer object i is automatically converted back to primitive int
        int a = i;
        System.out.println(a);  // Output: 10

        // Autoboxing: primitive char 'w' is automatically converted to a Character object
        Character c = 'w';

        // Auto-unboxing: Character object c is automatically converted back to primitive char
        char ch = c;

        System.out.println(c);  // Output: w
    }
}
