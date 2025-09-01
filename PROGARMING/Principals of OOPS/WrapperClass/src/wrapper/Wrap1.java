package wrapper;  // This declares that the class is in the 'wrapper' package

public class Wrap1 {
    public static void main(String[] args) {
        int a = 10;  // Primitive int variable

        // Manually create an Integer object using the deprecated constructor
        Integer i = new Integer(a);
        System.out.println(i.toString());  // Calls toString() to print the Integer object

        // Manually create a Double object using its constructor
        Double d = new Double(10.875);
        System.out.println(d);  // Prints the Double object (calls toString() automatically)

        // Manually create a Character object using its constructor
        Character c = new Character('a');
        System.out.println(c);  // Prints the Character object
    }
}

//
//Integer i = a;  // Autoboxing: int to Integer automatically
//        System.out.println(i);  // toString() called automatically
//
//Double d = 10.875;  // Autoboxing: double literal to Double
//        System.out.println(d);  // toString() called automatically
//
//Character c = 'a';  // Autoboxing: char literal to Character
//        System.out.println(c);  // toString() called automatically