// Package declaration - The Neurologist class belongs to the Is_a_Realtionship.Hierchical package
package Is_a_Realtionship.Hierchical;

public class Neurologist extends Doctor {

    // Additional instance variables specific to Neurologist
    String spl;    // Specialization of the Neurologist (e.g., brain, nervous system)
    String organ;  // The organ the Neurologist specializes in (e.g., brain, spinal cord)

    // Default constructor - No parameters
    public Neurologist() {
        // This constructor does not do anything specific, but initializes the object.
    }

    // Parameterized constructor - Initializes the Neurologist object with all details
    public Neurologist(String name, double fee, String degree, int experience, String hospital, String spl, String organ) {
        // Call to the superclass (Doctor) constructor to initialize inherited fields
        super(name, fee, degree, experience, hospital);

        // Initialize new attributes specific to Neurologist
        this.spl = spl;     // Specialization of the Neurologist
        this.organ = organ; // Organ specialization (e.g., brain or spinal cord)
    }

    // Method to display Neurologist information
    public void displayNeurologist() {
        // Call the displayDoctor method from the Doctor class to display common doctor details
        displayDoctor();

        // Display the Neurologist's specific details
        System.out.println("Specialization: " + spl);
        System.out.println("Organ Specialization: " + organ);
    }
}
