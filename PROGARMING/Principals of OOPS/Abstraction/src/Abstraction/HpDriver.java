package Abstraction;

// Main class to test the abstraction and polymorphism
public class HpDriver {

    public static void main(String[] args) {
        // Creating a Hp reference pointing to a Windows object
        Hp h1 = new Windows();

        // Calls Windows version of print()
        h1.print();

        // Reassigning the same reference to a Linux object
        h1 = new Linux();

        // Calls Linux version of print()
        h1.print();
    }
}
