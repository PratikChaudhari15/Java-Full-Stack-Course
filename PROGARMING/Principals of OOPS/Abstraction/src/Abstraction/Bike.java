package Abstraction;

public class Bike extends Vehicle {

    public Bike() {
        super("Bike");
    }

    @Override
    void startEngine() {
        System.out.println("Bike engine started with button.");
    }
}
