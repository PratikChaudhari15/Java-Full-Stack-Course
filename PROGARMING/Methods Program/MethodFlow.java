class MethodFlow
{
	public static void main (String[] Args) // Main method: Entry point of execution
	{
		System.out.println("Main Starts"); // Step 1: Print message indicating main method execution begins

		add(52,85); // Step 2: Call the add method with arguments 52 and 85
		divison(12,2); // Step 5: Call the division method with arguments 12 and 2

		System.out.println("Main Ends"); // Step 8: Print message indicating main method execution ends
	}

	public static void add(int x, int y) // Step 3: add method starts execution
	{
		System.out.println("Add Starts"); // Step 4: Print message indicating add method execution begins
		int res = x + y; // Calculate sum of x and y
		System.out.println(res); // Print the result of addition
		System.out.println("Add Ends"); // Step 4: Print message indicating add method execution ends
	}

	public static void divison(int x , int y) // Step 6: division method starts execution
	{
		System.out.println("Division Starts"); // Step 7: Print message indicating division method execution begins
		double res = x / y; // Integer division (12/2 = 6) [⚠️ Could be fixed for precision]
		System.out.println(res); // Print the result of division
		System.out.println("Division Ends"); // Step 7: Print message indicating division method execution ends
	}
}
/*🚀 Flow of Execution (Step-by-Step)
Execution starts in the main() method.

"Main Starts" is printed.

add(52,85) is called.

Control moves to the add method.

"Add Starts" is printed.

52 + 85 is calculated (res = 137).

137 is printed.

"Add Ends" is printed.

Control returns to main().

divison(12,2) is called.

Control moves to the divison method.

"Division Starts" is printed.

12 / 2 is calculated (res = 6).

6 is printed.

"Division Ends" is printed.

Control returns to main().

"Main Ends" is printed, and execution completes.*/