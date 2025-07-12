package Interfaces;

public class PaymentDriver {
    public static void main(String[] args) {
        PaytmUser user1 = new PaytmUser();  // Creating object of PaytmUser

        user1.payUsingUPI();       // Calling UPI payment method
        user1.payUsingWallet();    // Calling Wallet payment method
    }
}
//✅ Flow of Execution:
//main() runs in PaymentDriver.
//
//It creates an object of PaytmUser, which extends the abstract class Paytm.
//
//Paytm implements both Upi and Wallet, so it provides logic for both payUsingUPI() and payUsingWallet().
//
//We call both methods using the object user1.

//✅ What You Learned:
//Multiple inheritance using interfaces is achieved because Paytm implements both Upi and Wallet.
//
//Interfaces allow you to inherit multiple functionalities without ambiguity.
//
// Abstract class Paytm can provide shared logic for all users (like UPI and Wallet implementation).
//
//A concrete class PaytmUser is required to create objects.