package Abstraction;

// Abstract class representing a generic calculator
public abstract class Calculator {
    String brand = "Casio";  // Brand of calculator

    // Default constructor
    public Calculator() {
    }

    // Abstract methods to be implemented by subclasses
    public abstract void addition(int n1, int n2);
    public abstract void subtraction(int n1, int n2);
    public abstract void division(double n1, double n2);
}
