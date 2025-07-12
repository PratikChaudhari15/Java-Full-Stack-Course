package wrapper;  // Defines the package name

public class Unboxing {
    public static void main(String[] args) {
        // Create an Integer object with value 100
        Integer i = new Integer(100);

        // Manual unboxing: convert Integer object to primitive int using intValue()
        int ans = i.intValue();
        System.out.println(ans);  // Output: 100

        // Create a Character object with value 'a'
        Character c = new Character('a');

        // Manual unboxing: convert Character object to primitive char using charValue()
        char ch = c.charValue();
        System.out.println(ch);  // Output: a

        // Create a Boolean object with value true
        Boolean b = new Boolean(true);

        // Manual unboxing: convert Boolean object to primitive boolean using booleanValue()
        boolean val = b.booleanValue();
        System.out.println(val);  // Output: true
    }
}


//Integer i = 100; // Autoboxing
//int ans = i;     // Auto-unboxing
//
//Character c = 'a'; // Autoboxing
//char ch = c;       // Auto-unboxing
//
//Boolean b = true;  // Autoboxing
//boolean val = b;   // Auto-unboxing
