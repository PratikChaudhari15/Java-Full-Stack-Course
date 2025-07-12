package Is_a_Realtionship.MultiLevel_Inheritance;

/**
 * Subclass of Aeroplane, representing a fighter plane.
 */
public class Fighterplane extends Aeroplane {
    int generation;
    int seats;
    int range;
    String type;
    String refuelType;

    // Default constructor
    public Fighterplane() {}

    // Parameterized constructor
    public Fighterplane(String brand, double price, int engine, int manufactureYear, int fuelCapacity, int speed, int weight, int capacity,
                        int generation, int seats, int range, String type, String refuelType) {
        super(brand, price, engine, manufactureYear, fuelCapacity, speed, weight, capacity);
        this.generation = generation;
        this.seats = seats;
        this.range = range;
        this.type = type;
        this.refuelType = refuelType;
    }

    // Method to display fighter plane details
    public void displayFighterplane() {
        displayAeroplane();  // Call superclass display
        System.out.println("=== Fighterplane Details ===");
        System.out.println("Generation: " + generation);
        System.out.println("Seats: " + seats);
        System.out.println("Range: " + range);
        System.out.println("Type: " + type);
        System.out.println("Refuel Type: " + refuelType);
    }
}
