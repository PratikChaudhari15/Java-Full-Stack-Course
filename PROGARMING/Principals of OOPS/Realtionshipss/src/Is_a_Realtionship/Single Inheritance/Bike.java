package is_a_relationship;

/**
 * ✅ Bike is a subclass of Vehicle (Inheritance)
 * It inherits all vehicle properties and behavior while adding bike-specific features.
 */
public class Bike extends Vehicle {

    // ✅ Additional attributes specific to a bike
    String bikeType;     // e.g., Sports, Cruiser, Scooter
    boolean hasABS;      // ABS (Anti-lock Braking System)
    int engineCC;        // Engine capacity
    int gears;           // Number of gears
    boolean selfStart;   // Supports self-start or not

    /**
     * ✅ Default constructor
     * Useful when you want to create a bike object and set values later.
     */
    public Bike() {
    }

    /**
     * ✅ Parameterized constructor
     * Demonstrates constructor chaining using `super()` to initialize the parent class (Vehicle) attributes.
     * Ensures clean and maintainable code by avoiding repetition.
     */
    public Bike(String brand, String model, String color, double price, int maxSpeed, String fuelType,
                String bikeType, boolean hasABS, int engineCC, int gears, boolean selfStart) {

        // 🔁 Calls the constructor of the parent class to initialize inherited variables
        super(brand, model, color, price, maxSpeed, fuelType);

        // 🔁 Initializes child-class-specific variables
        this.bikeType = bikeType;
        this.hasABS = hasABS;
        this.engineCC = engineCC;
        this.gears = gears;
        this.selfStart = selfStart;
    }

    /**
     * ✅ Method to display full bike information
     * Demonstrates method reuse (from parent class) + child-specific behavior.
     */
    public void displayBike() {
        // 🔁 Reusing display logic from the Vehicle class
        super.displayVehicle();

        // ✅ Displaying bike-specific details
        System.out.println("Bike Type  : " + bikeType);
        System.out.println("Has ABS    : " + hasABS);
        System.out.println("Engine CC  : " + engineCC);
        System.out.println("Gears      : " + gears);
        System.out.println("Self Start : " + selfStart);
    }
}
