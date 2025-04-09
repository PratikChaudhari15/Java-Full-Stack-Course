// Blueprint of a student object
class Students1
{
	// Instance variables (unique for each object)
	String name;
	int age;
	String collage;
	String degree;
	int roll;
	// 1️⃣ No-Argument Constructor
	Students1()
	{
		System.out.println("From no args Constructor"); // This will print when this constructor is called
		System.out.println(this); // Prints reference of the current object
	}

	// 2️⃣ Parameterized Constructor
	Students1(String name , int age, String collage,String degree , int roll)
	{
		// Using 'this' to refer to instance variables (distinguish from local parameters)
		this.name = name;
		this.age = age;
		this.collage = collage ;
		this.degree = degree;
		this.roll = roll;
	}

	// 3️⃣ Method to display student details
	public void displayStudents1()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(collage);
		System.out.println(degree);
		System.out.println(roll);
	}
}
