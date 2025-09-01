// Package declaration - The Cardiologist class belongs to the same package as Doctor
package Is_a_Realtionship.Hierchical;

public class Cardiologist extends Doctor {

    // Additional instance variables specific to Cardiologist
    String spl;    // Specialization of the Cardiologist (e.g., heart diseases)
    String organ;  // The organ the Cardiologist specializes in (e.g., heart)

    // Default constructor - No parameters
    public Cardiologist() {
        // This constructor doesn't do anything specific but initializes the object.
    }

    // Parameterized constructor - Initializes the Cardiologist object with all details
    Cardiologist(String name, double fee, String degree, int experience, String hospital, String spl, String organ) {
        // Calling the parent class (Doctor) constructor to initialize inherited attributes
        this.name = name;
        this.fee = fee;
        this.degree = degree;
        this.experience = experience;
        this.hospital = hospital;

        // Initialize new attributes specific to Cardiologist
        this.spl = spl;       // Specialization of the Cardiologist
        this.organ = organ;   // Organ specialization
    }

    // Method to display Cardiologist information
    public void displayCardiologist() {
        // Call the method from the parent class (Doctor) to display doctor details
        displayDoctor();

        // Display the Cardiologist's specific details
        System.out.println("Specialization: " + spl);
        System.out.println("Organ Specialization: " + organ);
    }
}
