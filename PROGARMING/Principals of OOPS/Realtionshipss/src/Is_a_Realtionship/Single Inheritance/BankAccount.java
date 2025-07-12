package Is_a_Realtionship;

// Parent class representing a general bank account
public class BankAccount {
    // Instance variables (attributes of a bank account)
    String name;
    String bankName;
    String ifsc;
    String branch;
    long accno;
    long phno;
    int pin;

    // Default constructor
    public BankAccount() {
        // No initialization
    }

    // Parameterized constructor to initialize bank account details
    BankAccount(String name, String bankName, String ifsc, String branch, long accno, long phno, int pin) {
        this.name = name;
        this.bankName = bankName;
        this.ifsc = ifsc;
        this.branch = branch;
        this.accno = accno;
        this.phno = phno;
        this.pin = pin;
    }

    // Method to display basic bank account details
    public void displayBankAcc() {
        System.out.println("Name        : " + name);
        System.out.println("Bank Name   : " + bankName);
        System.out.println("IFSC Code   : " + ifsc);
        System.out.println("Branch      : " + branch);
        System.out.println("Account No  : " + accno);
        System.out.println("Phone No    : " + phno);
    }
}
