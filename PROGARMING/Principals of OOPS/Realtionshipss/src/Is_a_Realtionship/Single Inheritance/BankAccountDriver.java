package Is_a_Realtionship;

// Driver class to test the BankAccount and SavingAccount functionality
public class BankAccountDriver {
    public static void main(String[] args) {

        // Creating a SavingAccount object using parameterized constructor
        SavingAccount s1 = new SavingAccount("Raju", "ICICI", "ICIC123", "Deccan",
                65758234198L, 1234, 123456789L,
                5000.0, 3.0, "Saving ACC");

        // Displaying inherited and specific details
        System.out.println("----- Saving Account Details -----");
        s1.displaySavingAccount();
    }
}
