package DownCasting;

public class Son extends Father {
    String name = "Ram";

    @Override
    public void displayName() {
        System.out.println(name);
    }

    // Method specific to Son class
    public void drinking() {
        System.out.println("Son drinks sometimes.");
    }

    // Optionally override Father's method
    @Override
    public void smoking() {
        System.out.println("Son avoids smoking.");
    }
}
