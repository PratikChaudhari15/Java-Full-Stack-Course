class Pattern122
{
	public static void main(String[] args) 
	{
		int n = 5; // Define the number of rows in the pattern
		
		// Outer loop controls the number of rows
		for (int i = 1; i <= n; i++) 
		{
			// Inner loop controls the number of columns in each row
			for (int j = 1; j <= i; j++ )
			{
				// Check if the sum of the row index and column index is even
				if ((i + j) % 2 == 0) 
				{
					System.out.print(1 + " "); // Print 1 if sum is even
				}
				else 
					System.out.print(0 + " "); // Print 0 if sum is odd
			}
			System.out.println(); // Move to the next line after each row
		}
	}
}


/*

1
0 1
1 0 1
0 1 0 1
1 0 1 0 1

*/