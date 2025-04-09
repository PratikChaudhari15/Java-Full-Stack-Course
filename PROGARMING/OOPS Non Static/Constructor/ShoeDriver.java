// Driver class containing main method
class ShoeDriver
{
	public static void main(String[] args) 
	{
		// 1️⃣ Creating object s1 using no-arg constructor
		Shoe s1 = new Shoe(); // This triggers the non-static block before constructor
		s1.displayShoe();     // Again printing details after constructor completes

		System.out.println(".,....................,,,,,.");

		// 2️⃣ Creating object s2 using parameterized constructor
		Shoe s2 = new Shoe(3566.56, 10, "sports", "blue");
		s2.displayShoe();     // Printing updated values
	}
}
// 🔁 Flow of Execution
// 1️⃣ When Shoe s1 = new Shoe(); is executed:
// Step 1: Memory allocated → brand = "Reebbok" is initialized.

// Step 2: Non-static block runs:

// Since brand.charAt(0) == 'R', it goes to else and sets price = 500.

// Calls displayShoe() which prints:
// Reebbok
// 500.0
// 0
// null
// null

// Step 3: No-arg constructor runs → does nothing.

// Step 4: After constructor, you again call s1.displayShoe() which prints same data


// 2️⃣ When Shoe s2 = new Shoe(3566.56, 10, "sports", "blue"); is executed:
// Step 1: Memory allocated → brand = "Reebbok" is initialized.

// Step 2: Non-static block runs again (for this new object):

// Same check: brand is "Reebbok", so sets price = 500.

// Calls displayShoe() which prints (at this moment, other fields are not initialized yet):
// Reebbok
// 500.0
// 0
// null
// null


// Step 3: Parameterized constructor runs:

// Overwrites price to 3566.56, size to 10, etc.

// Step 4: After constructor, you again call s2.displayShoe() which prints:
// Reebbok
// 3566.56
// 10
// blue
// sports




