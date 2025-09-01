package is_a_relationship;

public class VehicleDriver {
    public static void main(String[] args) {
        // ✅ Creating a Bike object using parameterized constructor
        Bike b1 = new Bike("Honda", "Unicorn", "Black", 150000.0, 120, "Petrol",
                "Standard", true, 160, 5, true);

        // ✅ Displaying the full information
        System.out.println("--- Vehicle Details ---");
        b1.displayBike();
    }
}
