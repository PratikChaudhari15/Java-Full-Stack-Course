package Abstraction;

public abstract class Vehicle {
    String type;

    public Vehicle(String type) {
        this.type = type;
    }

    abstract void startEngine();

    void displayType() {
        System.out.println("Vehicle type: " + type);
    }
}
