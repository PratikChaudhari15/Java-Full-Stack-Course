// Package declaration - The Cardiologist class belongs to the same package as Doctor
package Upcasting;

// Cardiologist is a subclass of Doctor (IS-A relationship)
public class Cardiologist extends Doctor {

    // Additional instance variables specific to Cardiologist
    String spl;    // Specialization field (e.g., Cardiology)
    String organ;  // Specific organ the doctor specializes in (e.g., heart)

    // Default constructor - No parameters
    public Cardiologist() {
        // This constructor initializes an object with default values (if any)
        // Implicitly calls the superclass's default constructor
    }

    // Parameterized constructor - Initializes both inherited and specific attributes
    public Cardiologist(String name, double fee, String degree, int experience, String hospital, String spl, String organ) {
        // Optionally, call the superclass constructor for better readability:
        // super(name, fee, degree, experience, hospital);

        // Directly assigning inherited variables (not a best practice but works here since they are not private)
        this.name = name;
        this.fee = fee;
        this.degree = degree;
        this.experience = experience;
        this.hospital = hospital;

        // Initialize Cardiologist-specific attributes
        this.spl = spl;
        this.organ = organ;
    }

    // Method to display Cardiologist-specific information
    public void displayCardiologist() {
        // Call parent method to display common doctor details
        displayDoctor();

        // Display Cardiologist-specific fields
        System.out.println("Specialization: " + spl);
        System.out.println("Organ Specialization: " + organ);
    }
}
