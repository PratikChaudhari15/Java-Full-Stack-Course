package Principals_of_OOPS; // Package declaration

// BankAccount class definition
public class BankAccount {
	
	// Private instance variables (encapsulation)
	private String username ; 
	private String bankName;
	private long accno;
	private int pin;
	private String ifsc;
	private double balance; // Initially 0.0

	// Constructor to initialize the bank account
	BankAccount(String userName, String bankName, long accno, int pin, String ifsc)
	{
		username = userName;         // Assign user name
		this.bankName = bankName;    // Assign bank name
		this.accno = accno;          // Assign account number
		this.pin = pin;              // Assign PIN
		this.ifsc = ifsc;            // Assign IFSC code
	}

	// Getter for username
	public String getUserName()
	{
		return username;
	}

	// Getter for bank name
	public String getBankName()
	{
		return bankName;
	}

	// Getter for account number
	public long getAccno()
	{
		return accno;
	}

	// Method to change the pin (with validation)
	public void setPin(long accno, int oldPin, int newPin)
	{
		// Check if account number and old pin match
		if (this.accno == accno && pin == oldPin)
		{
			pin = newPin; // Set new pin
			System.out.println("pin updated");
		}
		else
		{
			System.out.println("Invalid Credentials"); // If credentials don't match
		}
	}

	// Getter for IFSC code
	public String getIFSC()
	{
		return ifsc;
	}

	// Method to get current balance after verifying credentials
	public double getBalance(long accno, int pin)
	{
		// Check if credentials match
		if (this.accno == accno && this.pin == pin)
		{
			return balance; // Return balance
		}
		else
		{
			System.out.println("Invalid credentials");
			return 0; // Return 0 if wrong credentials
		}
	}

	// Method to credit (deposit) amount to account
	public void credit(long accno, int pin, double amt)
	{
		if(this.accno == accno && this.pin == pin) // Check credentials
		{
			if(amt > 0) // Amount should be positive
			{
				balance += amt; // Add to balance
				System.out.println("Amount Credited");
			}
			else
			{
				System.out.println("invalid amount"); // Negative or zero amount
			}
		}
		else
		{
			System.out.println("Invalid Credentials"); // Wrong credentials
		}
	}

	// Method to debit (withdraw) amount from account
	public void debit(long accno, int pin, double amt)
	{
		if(this.accno == accno && this.pin == pin) // Check credentials
		{
			if(amt > 0) // Valid amount
			{
				if(balance - amt > 1000) // Ensure ₹1000 minimum balance
				{
					balance -= amt; // Deduct from balance
					System.out.println("Amount Debited");
				}
				else
				{
					System.out.println("Insufficient balance"); // Not enough funds
				}
			}
			else
			{
				System.out.println("Invalid Amount"); // Negative or 0 amount
			}
		}
		else
		{
			System.out.println("Invalid Credentials"); // Wrong pin or accno
		}
	}
}
