package Polymorphism;

public class TestDriver {
    public static void main(String[] args) {

        // Polymorphism: Base class reference pointing to child class object
        Test1 t1 = new Test2();

        // Method Shadowing:
        // Since 'demo' is static, it's resolved by reference type (Test1)
        t1.demo();  // Output: From static demo of class Test1

        // Method Overriding:
        // Resolved at runtime — child class version is called
        t1.test();  // Output: From non-static test of class Test2

        // Variable Shadowing:
        // Instance and static variables are resolved by reference type (Test1)
        System.out.println(t1.a);  // Output: 10 (Test1's 'a')
        System.out.println(t1.b);  // Output: 100 (Test1's static 'b')
    }
}
