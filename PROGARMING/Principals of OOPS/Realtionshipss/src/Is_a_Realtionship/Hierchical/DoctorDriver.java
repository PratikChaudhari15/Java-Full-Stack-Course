// Package declaration - The DoctorDriver class belongs to the Is_a_Realtionship.Hierchical package
package Is_a_Realtionship.Hierchical;

public class DoctorDriver {

    public static void main(String[] args)
    {

        // Creating an object of Cardiologist using the parameterized constructor
        Cardiologist c1 = new Cardiologist("Pratik", 300, "MBBS", 4, "MMH", "MDCcardio", "Heart");

        // Displaying the details of the Cardiologist using inherited method from Doctor class
        c1.displayDoctor();      // Calls displayDoctor() method from Doctor class
        c1.displayCardiologist(); // Calls displayCardiologist() method from Cardiologist class

        // Print separator to distinguish between the two doctor details
        System.out.println("--------");

        // Creating an object of Neurologist using the parameterized constructor
        Neurologist n1 = new Neurologist("Raju", 500, "BHMS", 2, "Karad", "MDCNeuro", "Brain");

        // Displaying the details of the Neurologist using inherited method from Doctor class
        n1.displayDoctor();      // Calls displayDoctor() method from Doctor class
        n1.displayNeurologist(); // Calls displayNeurologist() method from Neurologist class
    }
}
