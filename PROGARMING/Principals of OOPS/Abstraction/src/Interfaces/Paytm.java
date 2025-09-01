package Interfaces;

// Paytm implements both Upi and Wallet interfaces
public abstract class Paytm implements Upi, Wallet {

    // Implementing UPI payment method
    public void payUsingUPI() {
        System.out.println("Paying using UPI through Paytm");
    }

    // Implementing Wallet payment method
    public void payUsingWallet() {
        System.out.println("Paying using Wallet through Paytm");
    }
}
