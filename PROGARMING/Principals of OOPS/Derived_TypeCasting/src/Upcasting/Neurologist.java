// Package declaration - Place this class in the Upcasting package
package Upcasting;

// Neurologist is a subclass of Doctor, representing a specific type of doctor
public class Neurologist extends Doctor {

    // Additional instance variables specific to Neurologist
    String spl;    // Specialization field (e.g., Neurology)
    String organ;  // Specific organ or system (e.g., brain, spinal cord)

    // Default constructor - No parameters
    public Neurologist() {
        // Implicit call to the superclass's default constructor (Doctor())
        // Used when creating an object without setting attributes initially
    }

    // Parameterized constructor - Initializes both inherited and specific fields
    public Neurologist(String name, double fee, String degree, int experience, String hospital, String spl, String organ) {
        // Call to superclass constructor to initialize inherited fields
        super(name, fee, degree, experience, hospital);

        // Initialize Neurologist-specific attributes
        this.spl = spl;
        this.organ = organ;
    }

    // Method to display Neurologist-specific information
    public void displayNeurologist() {
        // Call the superclass method to display common doctor details
        displayDoctor();

        // Display Neurologist-specific fields
        System.out.println("Specialization: " + spl);
        System.out.println("Organ Specialization: " + organ);
    }
}
