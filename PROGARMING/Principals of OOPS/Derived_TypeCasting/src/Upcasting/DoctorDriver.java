package Upcasting;

public class DoctorDriver
{
    public static void main(String[] args)
    {
        // Upcasting: Cardiologist object is assigned to Doctor reference.
        Doctor d1 = new Cardiologist("Pratik", 300, "MBBS", 3, "Karad", "MD Cardio", "Heart");

        // Only Doctor methods can be called using Doctor reference
        // This will call the Doctor version of displayDoctor(), not Cardiologist-specific info
        d1.displayDoctor();  // ✅ Displays only Doctor details, not specialization

        System.out.println("----------------------------------");

        // Upcasting: Neurologist object is assigned to Doctor reference
        Doctor d2 = new Neurologist("Raju", 800, "MBBS", 8, "Poura Hospital", "MD Neuro", "Brain");

        // Same as above — only Doctor methods are accessible unless overridden
        d2.displayDoctor();  // ✅ Displays only Doctor details

        System.out.println("----------------------------------");

    }
}
