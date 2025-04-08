// This is the class that defines a Student blueprint
class Students
{
	// Instance variables (each object of Students will have its own copy)
	String name;
	int age;
	String collage;
	String degree;
	int roll;

	// No-argument constructor – called when you create an object using new Students()
	Students()
	{
		System.out.println("From no args Constructor"); // Will be printed during object creation
		System.out.println(this); // 'this' refers to the current object reference
	}

	// Non-static method to display student details
	public void displayStudents()
	{
		// local variable (commented) – would have overridden the instance variable if used
		// String name = "Mighty Raju";

		System.out.println(name); // prints the instance variable (not the commented local one)
		// System.out.println(this.name); // this would do the same – print the instance variable

		System.out.println(this); // prints object reference again (same as constructor)

		// prints remaining details
		System.out.println(age);
		System.out.println(collage);
		System.out.println(degree);
		System.out.println(roll);
	}
}
