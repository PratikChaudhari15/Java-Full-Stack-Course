// Package declaration - This indicates that the Doctor class belongs to the Is_a_Realtionship.Hierchical package
package Is_a_Realtionship.Hierchical;

public class Doctor {

    // Instance variables (attributes) of the Doctor class
    String name;        // Name of the doctor
    double fee;         // Consultation fee of the doctor
    String degree;      // Medical degree of the doctor
    int experience;     // Number of years of experience the doctor has
    String hospital;    // The hospital where the doctor works

    // Default constructor - No parameters
    public Doctor() {
        // No specific logic here, simply initializes the object without setting any values
    }

    // Parameterized constructor - Allows setting all the fields when creating an instance of Doctor
    public Doctor(String name, double fee, String degree, int experience, String hospital) {
        this.name = name;          // Initialize the name
        this.fee = fee;            // Initialize the fee
        this.degree = degree;      // Initialize the degree
        this.experience = experience;  // Initialize the experience
        this.hospital = hospital;  // Initialize the hospital
    }

    // Method to display doctor's information
    public void displayDoctor() {
        // Display the doctor's details
        System.out.println("Name: " + name);
        System.out.println("Fee: " + fee);
        System.out.println("Degree: " + degree);
        System.out.println("Experience: " + experience);
        System.out.println("Hospital: " + hospital);
    }
}
