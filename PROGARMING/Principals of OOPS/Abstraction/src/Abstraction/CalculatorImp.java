package Abstraction;

// Concrete implementation of Calculator
public class CalculatorImp extends Calculator {

    @Override
    public void addition(int n1, int n2) {
        System.out.println(n1 + n2);  // Adds and prints result
    }

    @Override
    public void subtraction(int n1, int n2) {
        System.out.println(n1 - n2);  // Subtracts and prints result
    }

    @Override
    public void division(double n1, double n2) {
        if (n2 != 0) {
            System.out.println(n1 / n2);  // Divides and prints result
        } else {
            System.out.println("Cannot divide by zero.");
        }
    }

    // Extra helper method (not required by abstract class)
    public void message() {
        System.out.println("Something is wrong");
    }
}
