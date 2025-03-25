import java.util.Scanner;
class CurrencyConvertor
{
	public static void main(String []Args) 
	{
		System.out.println("Main Starts"); // Indicating program execution starts

		Scanner sc = new Scanner(System.in); // Creating a Scanner object for user input
		System.out.print("Enter the Rupee Value : ");
		double rupee = sc.nextDouble(); // Taking user input in INR (Indian Rupee)

		rupeeToDollar(rupee); // Calling method to convert Rupees to Dollars

		System.out.println("Main Ends"); // Indicating program execution ends
	}
	// Method to convert Rupees to Dollars
	public static void rupeeToDollar(double rupee)
	{
		System.out.println("INR to USD Conversion Starts");

		double dollar = rupee / 87.25; // Conversion rate: 1 USD = 87.25 INR
		System.out.println("USD Value: " + dollar);

		dollarToEuro(dollar); // Calling method to convert Dollars to Euros

		System.out.println("INR to USD Conversion Ends");
	}

	// Method to convert Dollars to Euros
	public static void dollarToEuro(double dollar)
	{
		System.out.println("USD to EUR Conversion Starts");

		double euro = dollar * 0.95; // Conversion rate: 1 USD = 0.95 EUR
		System.out.println("EUR Value: " + euro);

		euroToDirham(euro); // Calling method to convert Euros to Dirhams

		System.out.println("USD to EUR Conversion Ends");
	}

	// Method to convert Euros to Dirhams
	public static void euroToDirham(double euro)
	{
		System.out.println("EUR to AED Conversion Starts");

		double dirham = euro * 3.85; // Conversion rate: 1 EUR = 3.85 AED
		System.out.println("AED Value: " + dirham);

		System.out.println("EUR to AED Conversion Ends");
	}
}
/*📌 Flow of Execution
Program starts with main()

Prints "Main Starts"

Takes user input for INR (Indian Rupees)

Calls rupeeToDollar(rupee)

rupeeToDollar(double rupee) executes

Prints "INR to USD Conversion Starts"

Converts INR → USD

Calls dollarToEuro(dollar)

Prints "INR to USD Conversion Ends"

dollarToEuro(double dollar) executes

Prints "USD to EUR Conversion Starts"

Converts USD → EUR

Calls euroToDirham(euro)

Prints "USD to EUR Conversion Ends"

euroToDirham(double euro) executes

Prints "EUR to AED Conversion Starts"

Converts EUR → AED

Prints "EUR to AED Conversion Ends"

Returns back to main() and prints "Main Ends"

Program terminates successfully ✅*/