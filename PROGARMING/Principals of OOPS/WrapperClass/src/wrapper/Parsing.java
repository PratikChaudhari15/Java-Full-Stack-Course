package wrapper;  // Declares the package name

public class Parsing {
    public static void main(String[] args) {
        String s = "2342";  // String containing numeric characters

        // Parses the String "2342" and converts it to primitive int 2342
        int i = Integer.parseInt(s);
        System.out.println(i);  // Output: 2342

        String b = "true";  // String representing a boolean value

        // Parses the String "true" and converts it to primitive boolean true
        boolean ans = Boolean.parseBoolean(b);
        System.out.println(ans);  // Output: true

        String s3 = "a";  // String containing one character

        // Gets the first character from the String s3 using charAt(0)
        System.out.println(s3.charAt(0));  // Output: a
    }
}
//parseInt() is used for converting String → primitive.
//
//valueOf() can convert String → Wrapper Object (Integer).