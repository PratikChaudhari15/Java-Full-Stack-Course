class statVar2 {
    // Static variable to store account balance (shared across all instances)
    static double balance;

    public static void main(String[] args) {
        // Adding money to the balance
        credit(1000);
        
        // Withdrawing money from the balance
        debit(100);
    }

    // Method to debit (withdraw) money from the account
    public static void debit(double amt) {
        // Checking if the amount is valid and ensures the remaining balance does not go below 1000
        if (amt > 0 && balance - amt > 1000) {
            balance -= amt; // Deducting amount
            System.out.println("Amount Debited");
            System.out.println("Your Current Balance is: " + balance);
        } else {
            System.out.println("Invalid Amount"); // Invalid withdrawal attempt
        }
    }

    // Method to credit (add) money to the account
    public static void credit(double amt) {
        // Checking if the credited amount is valid
        if (amt > 0) {
            balance += amt; // Adding amount to balance
            System.out.println("Amount Credited");
            System.out.println("Your Current Balance is: " + balance);
        } else {
            System.out.println("Invalid Amount"); // Invalid deposit attempt
        }
    }
}

