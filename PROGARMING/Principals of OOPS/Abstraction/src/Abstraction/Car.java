package Abstraction;

public class Car extends Vehicle {

    public Car() {
        super("Car");
    }

    @Override
    void startEngine() {
        System.out.println("Car engine started with key ignition.");
    }
}
