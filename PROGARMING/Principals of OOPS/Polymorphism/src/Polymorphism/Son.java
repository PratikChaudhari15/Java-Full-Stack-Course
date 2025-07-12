package Polymorphism;

// Subclass that overrides methods from Father
public class Son extends Father {

    // Overriding the 'name' method from Father
    @Override
    public void name() {
        System.out.println("Good Boy");
    }

    // Optionally, you could override 'finance' as well
    @Override
    public void finance() {
        System.out.println("Middle Class");
    }
}
