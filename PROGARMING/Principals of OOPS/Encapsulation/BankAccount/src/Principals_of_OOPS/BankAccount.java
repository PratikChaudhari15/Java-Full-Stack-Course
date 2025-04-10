package Principals_of_OOPS;

public class BankAccount {
	private String username ; 
	private String bankName;
	private long accno;
	private int pin;
	private String ifsc;
	private double balance;
	
	BankAccount(String userName,String bankName ,long accno,int pin ,String ifsc)
	{
		username =userName;
		this.bankName =bankName;
		this.accno = accno;
		this.pin = pin ;
		this.ifsc = ifsc;
	}
	
	public String getUserName()
	{
		return username;
	}
	public String getBankName()
	{
		return bankName;
	}
	public long getAccno()
	{
		return accno;
	}
	public void setPin(long accno,int oldPin,int newPin)
	{
		if (this.accno==accno && pin == oldPin)
		{
			pin = newPin;
			System.out.println("pin updated");
		}
		else
		{
			System.out.println("Invalid Credentials");
		}
		
	}
	public String getIFSC()
	{
		return ifsc;
	}
	public double getBalance(long accno,int pin)
	{
		if (this.accno == accno && this.pin == pin)
		{
			return balance;
		}
		else
		{
			System.out.println("Invalid credentials");
			
			return 0;
		}
	}
	public void credit (long accno,int pin , double amt)
	{
		if(this.accno == accno && this.pin == pin)
		{
			if(amt>0)
			{
				balance+=amt;
				System.out.println("Amount Credited");
			}
			else
			{
				System.out.println("invalid amount");
			}
		}
		else
		{
			System.out.println("Invalid Credentials");
		}
	}
	public void debit(long accno,int pin ,double amt)
	{
		if(this.accno == accno && this.pin ==pin)
		{
			if(amt>0)
			{
				if(balance-amt>1000)
				{
					balance-=amt;
					System.out.println("Amount Debited");
				}
				else
				{
					System.out.println("Insuffient balance");
				}
			}
			else
			{
				System.out.println("Invalid Amount");
			}
		}
		else
		{
			System.out.println("Invalid Credentials");
		}
	}
}
