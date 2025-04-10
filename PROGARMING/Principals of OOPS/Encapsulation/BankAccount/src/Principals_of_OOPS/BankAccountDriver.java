package Principals_of_OOPS;

public class BankAccountDriver {
	public static void main (String []args)
	{
		BankAccount b1 = new BankAccount("Raju","ICICI",987654321,123,"IcIC4545");
		
		System.out.println(b1.getBalance(987654321, 123));
		b1.credit(987654321, 123, 10000);
		b1.debit(987654321, 123, 1520);
		
		System.out.println(b1.getBalance(987654321, 123));
		
		b1.setPin(987654321, 123, 9876);
		
		
		b1.debit(987654321, 9876, 500);
	}
}