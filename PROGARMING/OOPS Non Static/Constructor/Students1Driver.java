// Driver class with main method – Entry point
class Students1Driver
{
	public static void main(String[] args) 
	{
		// 1️⃣ Creating object with parameterized constructor
		Students1 s1 = new Students1("Raju ", 21 , "FC collage", "BE", 685);
		// Calls the second constructor and assigns values
		s1.displayStudents1(); // prints values of s1

		// 2️⃣ Creating object with no-arg constructor
		Students1 s2 = new Students1();
		// Calls no-arg constructor, prints only constructor messages
		// s2 object has null/default values, but not printed

		// 3️⃣ Another object with parameterized constructor
		Students1 s3 = new Students1("Mahesh", 22, "JSPM", "BCA", 877);
		s3.displayStudents1(); // prints values of s3
	}
}

// 🔁 Flow of Execution Step-by-Step
// Main method starts in Students1Driver.

// First Object – s1
// Students1 s1 = new Students1("Raju ", 21 , "FC collage", "BE", 685);

// Calls the parameterized constructor.

// Values are assigned to instance variables using this.

// s1.displayStudents1() is called → prints values of s1.

// Second Object – s2
// Students1 s2 = new Students1();

// Calls the no-arg constructor.

// From no args Constructor
// Students1@hexcode  // object reference

// But doesn't assign any values to instance variables → remains null/0.

// Third Object – s3
// Students1 s3 = new Students1("Mahesh", 22, "JSPM", "BCA", 877);

// Calls the parameterized constructor again.
// Assigns and prints Mahesh's details via displayStudents1().


