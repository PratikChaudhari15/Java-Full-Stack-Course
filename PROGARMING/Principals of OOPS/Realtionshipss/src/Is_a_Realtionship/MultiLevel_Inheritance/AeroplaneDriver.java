package Is_a_Realtionship.MultiLevel_Inheritance;

/**
 * Driver class to test multi-level inheritance.
 */
public class AeroplaneDriver {
    public static void main(String[] args) {
        // Creating Sukhoi object with all properties
        Sukhoi s1 = new Sukhoi(
                "Sukhoi", 6483.43, 2, 2025, 500, 3444, 12, 50,
                5, 2, 1000, "Military", "Yes",
                "SU-57", 2022, "Missiles, AK47", "Russia", "Active"
        );

        // Displaying all details
        s1.displaySukhoi();
    }
}
