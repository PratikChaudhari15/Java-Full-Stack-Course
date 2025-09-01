package Polymorphism;

// Base class
public class Test1 {
    int a = 10;             // Instance variable
    static int b = 100;     // Static variable

    // Static method (not inherited in polymorphic behavior)
    public static void demo() {
        System.out.println("From static demo of class Test1");
    }

    // Non-static (instance) method — eligible for overriding
    public void test() {
        System.out.println("From non-static test of class Test1");
    }
}
