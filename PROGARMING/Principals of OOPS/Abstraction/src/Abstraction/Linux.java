package Abstraction;

// Concrete subclass of Hp representing a Linux device
public class Linux extends Hp {

    // Implementation of the print method for Linux
    @Override
    public void print() {
        System.out.println("Printing from Linux");
    }
}
