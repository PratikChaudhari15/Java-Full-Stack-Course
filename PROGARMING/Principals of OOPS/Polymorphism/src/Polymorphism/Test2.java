package Polymorphism;

// Subclass extending Test1
public class Test2 extends Test1 {

    // Shadowing instance variable 'a' with a different type
    String a = "Hi";

    // Shadowing static variable 'b' from the base class
    static String b = "Bye";

    // Shadowing static method demo (not overriding because static methods are not polymorphic)
    public static void demo() {
        System.out.println("From static demo of Test2");
    }

    // Overriding non-static method test()
    @Override
    public void test() {
        System.out.println("From non-static test of class Test2");
    }
}
