package wrapper;  // Declares the package name

public class PrimitiveToString {
    public static void main(String[] args) {
        int a = 100;  // Primitive int

        // Convert primitive int to String using String.valueOf()
        String s = String.valueOf(a);

        // Prints "10010" → because s is "100" (a String), so "100" + "10" = "10010"
        System.out.println(s + 10);

        boolean b = true;  // Primitive boolean

        // Convert primitive boolean to String using String.valueOf()
        String s2 = String.valueOf(b);

        // Prints "true"
        System.out.println(s2);
    }
}

//String.valueOf() is a common and safe way to convert any primitive (or even an object) to its String form.