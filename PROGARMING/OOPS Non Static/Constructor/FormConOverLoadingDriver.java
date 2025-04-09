// Driver class to test all overloaded constructors
class FormConOverLoadingDriver
{
	public static void main(String[] args)
	{
		FormConOverLoading f1 = new FormConOverLoading();
		f1.displayForm();

		FormConOverLoading f2 = new FormConOverLoading("Raju", 8958985, 'M', "15/55/5222");
		f2.displayForm();

		FormConOverLoading f3 = new FormConOverLoading("Rani", 9764679, 'F', "12/12/1153", 65896589, "O", "rani@gmail.com");
		f3.displayForm();
	}
}

// FormConOverLoading f2 = new FormConOverLoading("Raju", 8958985, 'M', "15/55/5222");

// Calls 4-parameter constructor → Assigns values to name, phone, gender, dob

// tel, blood, email remain default

// FormConOverLoading f3 = new FormConOverLoading(...);

// Calls 7-parameter constructor → Assigns values to all instance variables

