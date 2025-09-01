package Is_a_Realtionship.MultiLevel_Inheritance;

/**
 * Subclass of Fighterplane, representing a specific Sukhoi model.
 */
public class Sukhoi extends Fighterplane {
    String model;
    int launchYear;
    String weapons;
    String country;
    String service;

    // Default constructor
    public Sukhoi() {}

    // Parameterized constructor
    public Sukhoi(String brand, double price, int engine, int manufactureYear, int fuelCapacity, int speed, int weight, int capacity,
                  int generation, int seats, int range, String type, String refuelType,
                  String model, int launchYear, String weapons, String country, String service) {
        super(brand, price, engine, manufactureYear, fuelCapacity, speed, weight, capacity, generation, seats, range, type, refuelType);
        this.model = model;
        this.launchYear = launchYear;
        this.weapons = weapons;
        this.country = country;
        this.service = service;
    }

    // Method to display Sukhoi details
    public void displaySukhoi() {
        displayFighterplane();  // Call parent display method
        System.out.println("=== Sukhoi Details ===");
        System.out.println("Model: " + model);
        System.out.println("Launch Year: " + launchYear);
        System.out.println("Weapons: " + weapons);
        System.out.println("Country: " + country);
        System.out.println("Service: " + service);
    }
}
