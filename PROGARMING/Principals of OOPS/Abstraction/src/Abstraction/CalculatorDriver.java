package Abstraction;

// Driver class to test Calculator implementation
public class CalculatorDriver {
    public static void main(String[] args) {
        Calculator c1 = new CalculatorImp(); // Polymorphism in action

        c1.addition(10, 20);       // Output: 30
        c1.subtraction(10, 20);    // Output: -10
        c1.division(10, 3);        // Output: 3.333...

        System.out.println(c1.brand);
    }
}
