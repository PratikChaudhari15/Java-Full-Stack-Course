package Principals_of_OOPS; // Package declaration

// Driver class to test BankAccount
public class BankAccountDriver {
	
	public static void main(String[] args)
	{
		// Create BankAccount object with given details
		BankAccount b1 = new BankAccount("Raju", "ICICI", 987654321, 123, "IcIC4545");
		
		// Get and print initial balance (should be 0.0)
		System.out.println(b1.getBalance(987654321, 123));
		
		// Credit ₹10000 into the account
		b1.credit(987654321, 123, 10000);

		// Debit ₹1520 from the account
		b1.debit(987654321, 123, 1520);
		
		// Check balance after debit
		System.out.println(b1.getBalance(987654321, 123));
		
		// Change the PIN from 123 to 9876
		b1.setPin(987654321, 123, 9876);
		
		// Try to debit ₹500 using the new PIN
		b1.debit(987654321, 9876, 500);
	}
}
//
//🔁 Flow of Execution (Simple Steps)
//Object Creation:
//→ b1 object is created with Raju's account info using the constructor.
//→ PIN is 123 initially.
//
//Check Initial Balance:
//→ Calls getBalance() → PIN and accno match → Returns 0.0.
//
//Credit ₹10000:
//→ Calls credit() → Valid PIN and accno → Adds ₹10000.
//
//Debit ₹1520:
//→ Calls debit() → Valid, and after deduction balance is more than ₹1000 → Success.
//
//Check Updated Balance:
//→ Prints remaining balance.
//
//Update PIN to 9876:
//→ Valid old PIN → Changes PIN.
//
//Debit ₹500 Using New PIN:
//→ Uses updated PIN → Valid → Successful debit.
