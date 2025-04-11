package Principals_of_OOPS;

// Driver class to test the Empolyee class
public class EmpolyeeDriver {

    public static void main(String[] args) {

        // Creating an employee object with initial details
        Empolyee e1 = new Empolyee("Pratik", "TCS", "Junior Dev", 15000.0);

        // Displaying initial employee details
        e1.displayDetails();

        // Promoting employee and increasing salary
        e1.promote("Senior Dev", 18000);

        // Displaying updated details
        e1.displayDetails();
    }
}
