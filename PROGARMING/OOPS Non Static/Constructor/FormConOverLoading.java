// Class to demonstrate Constructor Overloading
class FormConOverLoading
{
	// Instance variables (form details)
	String name;
	long phone; 
	long tel;
	char gender;
	String blood;
	String email;
	String dob;

	// ✅ 1. Default constructor (no arguments)
	FormConOverLoading()
	{
		// Does not initialize anything, all fields will have default values
	}

	// ✅ 2. Constructor with 4 parameters
	FormConOverLoading(String name, long phone, char gender, String dob)
	{
		this.name = name;
		this.phone = phone;
		this.gender = gender;
		this.dob = dob;
	}

	// ✅ 3. Constructor with 5 parameters
	FormConOverLoading(String name, long phone, char gender, String dob, long tel)
	{
		this.name = name;
		this.phone = phone;
		this.gender = gender;
		this.dob = dob;
		this.tel = tel;
	}

	// ✅ 4. Constructor with 6 parameters
	FormConOverLoading(String name, long phone, char gender, String dob, long tel, String blood)
	{
		this.name = name;
		this.phone = phone;
		this.gender = gender;
		this.dob = dob;
		this.tel = tel;
		this.blood = blood;
	}

	// ✅ 5. Constructor with 7 parameters
	FormConOverLoading(String name, long phone, char gender, String dob, long tel, String blood, String email)
	{
		this.name = name;
		this.phone = phone;
		this.gender = gender;
		this.dob = dob;
		this.tel = tel;
		this.blood = blood;
		this.email = email;
	}

	// ✅ Method to print the form details
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
