package Is_a_Realtionship;

// Child class that extends BankAccount (IS-A Relationship)
public class SavingAccount extends BankAccount {
    // Additional fields specific to SavingAccount
    double balance;
    double interest;
    String type;

    // Default constructor
    public SavingAccount() {
        // No initialization
    }

    // Parameterized constructor to initialize both parent and child class fields
    SavingAccount(String name, String bankName, String ifsc, String branch,
                  long accno, int pin, long phno,
                  double balance, double interest, String type) {

        // Initializing parent class fields (inherited)
        this.name = name;
        this.bankName = bankName;
        this.ifsc = ifsc;
        this.branch = branch;
        this.accno = accno;
        this.pin = pin;
        this.phno = phno;

        // Initializing child class fields
        this.balance = balance;
        this.interest = interest;
        this.type = type;
    }

    // Method to display saving account details (parent + child)
    public void displaySavingAccount() {
        displayBankAcc(); // Calling parent method
        System.out.println("Balance     : " + balance);
        System.out.println("Interest    : " + interest + "%");
        System.out.println("Account Type: " + type);
    }
}
