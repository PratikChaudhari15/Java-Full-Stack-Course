// FormContChaining class represents a user form with different constructor chaining
class FormContChaining
{
	// Instance variables
	String name;
	long phone; 
	long tel;
	char gender;
	String blood;
	String email;
	String dob;

	// 💠 Default constructor
	FormContChaining()
	{
		// No initialization, all variables will have default values
	}

	// 💠 Constructor with 4 parameters
	// Called when only name, phone, gender, and dob are provided
	FormContChaining(String name, long phone, char gender, String dob)
	{
		this.name = name;
		this.phone = phone;
		this.gender = gender;
		this.dob = dob;
	}

	// 💠 Constructor with 5 parameters
	// Uses constructor chaining to call the 4-param constructor
	FormContChaining(String name, long phone, char gender, String dob, long tel)
	{
		this(name, phone, gender, dob); // calls 4-param constructor
		this.tel = tel;
	}

	// 💠 Constructor with 7 parameters
	// Uses constructor chaining to call the 5-param constructor
	FormContChaining(String name, long phone, char gender, String dob, long tel, String blood, String email)
	{
		this(name, phone, gender, dob, tel); // calls 5-param constructor
		this.blood = blood;
		this.email = email;
	}

	// 📋 Method to display the details of the form
	public void displayForm()
	{
		System.out.println("Name    : " + name);
		System.out.println("Phone   : " + phone);
		System.out.println("Gender  : " + gender);
		System.out.println("DOB     : " + dob);
		System.out.println("Tel     : " + tel);
		System.out.println("Blood   : " + blood);
		System.out.println("Email   : " + email);
		System.out.println("------------------------------");
	}
}
