package Is_a_Realtionship.MultiLevel_Inheritance;

/**
 * Base class representing a generic aeroplane.
 */
public class Aeroplane {
    String brand;
    double price;
    int engine;
    int manufactureYear;
    int fuelCapacity;
    int speed;
    int weight;
    int capacity;

    // Default constructor
    public Aeroplane() {}

    // Parameterized constructor
    public Aeroplane(String brand, double price, int engine, int manufactureYear, int fuelCapacity, int speed, int weight, int capacity) {
        this.brand = brand;
        this.price = price;
        this.engine = engine;
        this.manufactureYear = manufactureYear;
        this.fuelCapacity = fuelCapacity;
        this.speed = speed;
        this.weight = weight;
        this.capacity = capacity;
    }

    // Method to display aeroplane details
    public void displayAeroplane() {
        System.out.println("=== Aeroplane Details ===");
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Engine Count: " + engine);
        System.out.println("Manufacture Year: " + manufactureYear);
        System.out.println("Fuel Capacity: " + fuelCapacity);
        System.out.println("Speed: " + speed);
        System.out.println("Weight: " + weight);
        System.out.println("Capacity: " + capacity);
    }
}
