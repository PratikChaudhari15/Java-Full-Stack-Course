// This is the driver class which has the main method (entry point of the program)
class StudentsDriver
{
	public static void main(String[] args) {

		// Object creation → this calls the constructor automatically
		Students s1 = new Students();

		// Assigning values to instance variables using reference variable
		s1.name = "Raju";
		s1.roll = 5786;
		s1.degree = "BE";
		s1.age = 21;
		s1.collage = "FC collage";

		// Calling display method to print the values of s1
		s1.displayStudents();
	}
}


// 🔁 Flow of Execution:
// Main Method Starts in StudentsDriver.

// Students s1 = new Students();

// This line creates a new object of Students.

// The no-arg constructor is called.

// Inside the constructor:

// "From no args Constructor" is printed.

// this (which holds the memory address/reference of s1) is printed.

// Next, you assign values to s1:

// s1.name = "Raju"; and so on...

// Then, you call s1.displayStudents();

// Inside this method:

// It prints the values of the instance variables.

// Again prints this → same reference as in constructor.

// Output is printed to console.