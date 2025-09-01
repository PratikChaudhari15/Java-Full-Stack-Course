package is_a_relationship;

/**
 * Superclass representing common properties and behavior of all vehicles.
 * This class is meant to be inherited by more specific types of vehicles (e.g., Bike, Car).
 */
public class Vehicle {

    // ✅ Common attributes for all vehicles
    String brand;
    String model;
    String color;
    double price;
    int maxSpeed;
    String fuelType;

    /**
     * ✅ Default constructor
     * Used when we want to create an object without immediately setting values.
     * Allows flexibility for setting values later using object references.
     */
    public Vehicle() {
    }

    /**
     * ✅ Parameterized constructor
     * Allows setting all necessary vehicle attributes at the time of object creation.
     * This avoids calling multiple setter methods later.
     */
    public Vehicle(String brand, String model, String color, double price, int maxSpeed, String fuelType) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    /**
     * ✅ Method to display vehicle information
     * Can be reused in all child classes to show inherited data.
     */
    public void displayVehicle() {
        System.out.println("Brand     : " + brand);
        System.out.println("Model     : " + model);
        System.out.println("Color     : " + color);
        System.out.println("Price     : " + price);
        System.out.println("Max Speed : " + maxSpeed + " km/h");
        System.out.println("Fuel Type : " + fuelType);
    }
}
