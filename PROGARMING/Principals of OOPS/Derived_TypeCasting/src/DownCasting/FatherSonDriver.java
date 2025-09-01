package DownCasting;

public class FatherSonDriver {
    public static void main(String[] args) {
        // Upcasting: Son object is referenced by Father type
        Father f1 = new Son();

        // Calls the overridden method in Son
        f1.smoking(); // Output: Son avoids smoking.

        // Downcasting: Father reference is cast back to Son
        Son s1 = (Son) f1;

        // Now we can call methods specific to Son
        s1.drinking(); // Output: Son drinks sometimes.
        s1.smoking();  // Output: Son avoids smoking.
    }
}
