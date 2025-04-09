// Driver class to test FormContChaining
class FormContChainingDriver
{
	public static void main(String[] args)
	{
		// 🔹 f1: calls the default constructor
		// No data is passed → all values will be default (null, 0, etc.)
		FormContChaining f1 = new FormContChaining();
		f1.displayForm();

		// 🔹 f2: calls 4-param constructor
		// Only name, phone, gender, and dob are initialized
		FormContChaining f2 = new FormContChaining("Raju", 8958985, 'M', "15/55/5222");
		f2.displayForm();

		// 🔹 f3: calls 7-param constructor
		// It first calls 5-param constructor → which calls 4-param constructor
		// Then sets tel, blood, and email
		FormContChaining f3 = new FormContChaining("Rani", 9764679, 'F', "12/12/1153", 65896589, "O", "rani@gmail.com");
		f3.displayForm();
	}
}
