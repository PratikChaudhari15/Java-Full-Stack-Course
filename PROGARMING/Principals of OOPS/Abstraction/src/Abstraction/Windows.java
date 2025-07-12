package Abstraction;

// Concrete subclass of Hp representing a Windows device
public class Windows extends Hp {

    // Implementation of the print method for Windows
    @Override
    public void print() {
        System.out.println("Printing from windows");
    }
}
