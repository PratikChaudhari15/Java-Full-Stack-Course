package Abstraction;

public class VehicleDriver {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        v1.displayType();
        v1.startEngine();

        v2.displayType();
        v2.startEngine();
    }
}
//"I used an abstract class Vehicle that contains an abstract method startEngine() and a concrete method
// displayType(). Subclasses Car and Bike use extends to implement the specific logic for starting their
// engines. This shows abstraction by allowing the caller to use Vehicle without knowing the details of
// each type's engine-starting process."